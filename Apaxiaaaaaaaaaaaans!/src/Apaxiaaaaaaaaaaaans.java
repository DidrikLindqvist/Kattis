import java.util.Scanner;
/**
 * 
 * Project : Apaxiaaaaaaaaaaaans!
 * Date    : 12 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Apaxiaaaaaaaaaaaans {
	private String name = "";
	private String[] nameResult;
	private int nameLength = 0;

	public static void main(String[] args) {
		new Apaxiaaaaaaaaaaaans();
	}

	Apaxiaaaaaaaaaaaans() {
		readName();
		scanName();
		printResult();
	}

	private void printResult() {
		for (String string : nameResult) {
			System.out.print(string);
		}
		System.out.println();
	}

	private void scanName() {
		nameResult = name.split("");
		nameLength = nameResult.length;
		for (int i = 0; i < nameLength; i++) {
			checkDuplicate(i);

		}
	}

	private void checkDuplicate(int index) {
		for (int i = index + 1; i < nameLength; i++) {
			if (nameResult[i].compareTo(nameResult[index]) == 0) {
				nameResult[i] = "";
			} else {
				break;
			}
		}
	}

	private void readName() {
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		scan.close();
	}
}
