import java.util.Scanner;

/**
 * 
 * Project : Ragged Right Date : 11 nov. 2015
 * 
 * @author : Didrik Lindqvist
 */
public class RaggedRight {

	String[] textLines = new String[101]; // max 100 lines
	int longestLine = 0;
	int longestLineIndex = 0;
	int resultPenalty = 0;

	public static void main(String[] args) {
		new RaggedRight();
	}

	RaggedRight() {
		readInParagraph();
		mesureParagraphs();
		printResult();
	}

	private void readInParagraph() {
		Scanner scan = new Scanner(System.in);
		String line = "";
		int i = 0;
		while (scan.hasNext() && !(line = scan.nextLine()).equals("-1")) {
			textLines[i] = line;
			if (textLines[i].length() > longestLine) {
				longestLine = textLines[i].length();
				longestLineIndex = i;
			}
			i++;
		}
		scan.close();
	}

	private void mesureParagraphs() {
		for (int i = 0; i < textLines.length - 1; i++) {
			if (textLines[i + 1] == null)
				break;
			resultPenalty += calculateResult(textLines[i]);
		}
	}

	public int calculateResult(String line) {
		return (longestLine - line.length()) * (longestLine - line.length());
	}

	private void printResult() {
		System.out.println(resultPenalty);
	}

}
