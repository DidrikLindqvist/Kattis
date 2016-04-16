
import java.util.Scanner;
/**
 * 
 * Project : Eligibility
 * Date    : 11 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Eligibility {

	private int numberOfContestents;
	String[] contesters;
	String[] result;

	public static void main(String[] args) {
		new Eligibility();
	}

	Eligibility() {
		readContestents();
		scanContestents();
		printResult();
	}

	private void readContestents() {
		Scanner scan = new Scanner(System.in);
		numberOfContestents = Integer.parseInt(scan.nextLine());
		contesters = new String[numberOfContestents];

		for (int i = 0; i < numberOfContestents; i++) {
			contesters[i] = scan.nextLine();
		}
		scan.close();
	}

	private void scanContestents() {
		result = new String[numberOfContestents];

		for (int i = 0; i < numberOfContestents; i++) {
			String[] contester = contesters[i].split(" ");
			if (reqOne(contester)) {
				result[i] = contester[0] + " eligible";
			} else if (reqTwo(contester)) {
				result[i] = contester[0] + " eligible";
			} else if (reqThree(contester)) {
				result[i] = contester[0] + " ineligible";
			} else if (reqFour(contester)) {
				result[i] = contester[0] + " coach petitions";
			}
		}
	}

	private boolean reqOne(String[] contester) {
		String[] date = contester[1].split("/");
		return Integer.parseInt(date[0]) >= 2010;
	}

	private boolean reqTwo(String[] contester) {
		String[] date = contester[2].split("/");
		return Integer.parseInt(date[0]) >= 1991;
	}

	private boolean reqThree(String[] contester) {
		return Integer.parseInt(contester[3]) >= 41;
	}

	private boolean reqFour(String[] contester) {
		return true;
	}

	private void printResult() {
		for (String string : result) {
			System.out.println(string);
		}

	}
}
