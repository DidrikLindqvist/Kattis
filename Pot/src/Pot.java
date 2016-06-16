import java.util.ArrayList;
import java.util.Scanner;

public class Pot {
	private ArrayList<String> numbers;
	private int resNumber = 0;

	public static void main(String[] args) {
		new Pot();
	}

	Pot() {
		readData();
		analyzeData();
		printResult();
	}

	private void printResult() {
		System.out.println(resNumber);
	}

	private void analyzeData() {

		for (String number : numbers) {
			String[] digits = number.split("");
			int pow = Integer.parseInt(digits[digits.length - 1]);
			digits[digits.length - 1] = "";
			String mergeDigits = "";
			for (String digit : digits) {
				mergeDigits += digit;
			}

			resNumber += Math.pow(Integer.parseInt(mergeDigits), pow);
		}
	}

	private void readData() {
		Scanner scan = new Scanner(System.in);
		numbers = new ArrayList<String>();
		int numOfNumbers = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < numOfNumbers; i++) {
			numbers.add(scan.nextLine());
		}
		scan.close();
	}

}
