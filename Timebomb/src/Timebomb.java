import java.util.Scanner;
/**
 * 
 * Project : Timebomb
 * Date    : 12 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Timebomb {
	private String[] digits = new String[11];
	private String[] readLines = new String[7];
	private String[] digitsSeparated = new String[9];
	private String result = "";
	private boolean noValidDigit = false;

	public static void main(String[] args) {
		new Timebomb();
	}

	Timebomb() {
		setUpDigits();
		readLine();
		seperateLines();
		ScanLine();
		printResult();
	}

	private void seperateLines() {

		digitsSeparated[0] = "";
		digitsSeparated[1] = "";
		digitsSeparated[2] = "";
		digitsSeparated[3] = "";
		digitsSeparated[4] = "";
		digitsSeparated[5] = "";
		digitsSeparated[6] = "";
		digitsSeparated[7] = "";
		digitsSeparated[8] = "";

		for (int i = 0; i < 5; i++) {
			String[] line = readLines[i].split("");

			for (int j = 0; j < line.length; j++) {
				if (j == 0 || j == 1 || j == 2) {
					digitsSeparated[0] += line[j];
				} else if (j == 4 || j == 5 || j == 6) {
					digitsSeparated[1] += line[j];
				} else if (j == 8 || j == 9 || j == 10) {
					digitsSeparated[2] += line[j];
				} else if (j == 12 || j == 13 || j == 14) {
					digitsSeparated[3] += line[j];
				} else if (j == 16 || j == 17 || j == 18) {
					digitsSeparated[4] += line[j];
				} else if (j == 20 || j == 21 || j == 22) {
					digitsSeparated[5] += line[j];
				} else if (j == 24 || j == 25 || j == 26) {
					digitsSeparated[6] += line[j];
				} else if (j == 28 || j == 29 || j == 30) {
					digitsSeparated[7] += line[j];
				}
			}
		}
	}

	private void setUpDigits() {
		digits[0] = "**** ** ** ****"; // 0
		digits[1] = "  *  *  *  *  *"; // 1
		digits[2] = "***  *****  ***"; // 2
		digits[3] = "***  ****  ****";// 3
		digits[4] = "* ** ****  *  *"; // 4
		digits[5] = "****  ***  ****"; // 5
		digits[6] = "****  **** ****"; // 6
		digits[7] = "***  *  *  *  *"; // 7
		digits[8] = "**** ***** ****"; // 8
		digits[9] = "**** ****  ****"; // 9
	}

	private void readLine() {
		Scanner scan = new Scanner(System.in);
		readLines[0] = scan.nextLine();
		readLines[1] = scan.nextLine();
		readLines[2] = scan.nextLine();
		readLines[3] = scan.nextLine();
		readLines[4] = scan.nextLine();
		scan.close();
	}

	private void ScanLine() {
		int j = 0;
		while (digitsSeparated[j].length() != 0 && j < 8) {
			for (int i = 0; i < 10; i++) {

				if (digitsSeparated[j].compareTo(digits[i]) == 0) {
					result += i;
					break;
				}
				if (i == 9) {
					noValidDigit = true; // the digit checked is not valid.
				}
			}
			j++;
		}
	}

	private void printResult() {
		if (noValidDigit || result.length() == 0) {
			System.out.println("BOOM!!");
			System.exit(0);
		}
		double resultNum = Double.parseDouble(result) / 6;
		if (resultNum % 1 == 0) {
			System.out.println("BEER!!");
		} else {
			System.out.println("BOOM!!");
		}
	}
}
