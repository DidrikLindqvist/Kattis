import java.util.Scanner;

/**
 * 
 * Project : Reverse Rot
 * Date    : 12 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class ReverseRot {
	private String[] lines = new String[31];
	String[] highLetter = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
			"S", "T", "U", "V", "W", "X", "Y", "Z", "_", "." };
	private int numberOfJumps = 0;
	private String[] result;
	private int currentIndex = 0;
	private int numOfTestCases = 0;

	public static void main(String[] args) {
		new ReverseRot();
	}

	ReverseRot() {

		readInCases();
		calculateCases();
		printResult();

	}

	private void printResult() {
		for (int i = 0; i < numOfTestCases; i++) {
			String[] resultSplit = result[i].split("");

			for (int j = resultSplit.length - 1; j >= 4; j--) {
				System.out.print(resultSplit[j]);
			}

			System.out.println();
		}
	}

	private void calculateCases() {

		for (int i = 0; i < numOfTestCases; i++) {
			String[] splitLine = lines[i].split(" ");
			numberOfJumps = Integer.parseInt(splitLine[0]);
			String[] stringToRefactor = splitLine[1].split("");
			for (int j = 0; j < stringToRefactor.length; j++) {
				int tmp = getReplacementIndex(getIndexOfChar(stringToRefactor[j]));
				result[i] += highLetter[tmp];
			}
		}
	}

	private int getIndexOfChar(String string) {
		for (int i = 0; i < highLetter.length; i++) {
			if (highLetter[i].equals(string)) {
				return i;
			}
		}
		return 0;
	}

	private int getReplacementIndex(int index) {
		if ((numberOfJumps + index) > 28 - 1) {
			return (numberOfJumps + index) - 28;
		}
		return index + numberOfJumps;
	}

	private void readInCases() {
		Scanner scan = new Scanner(System.in);

		while (!(lines[numOfTestCases] = scan.nextLine()).equals("0")) {

			numOfTestCases++;
		}

		result = new String[numOfTestCases];
		scan.close();
	}
}
