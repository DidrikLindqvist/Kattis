import java.util.ArrayList;
import java.util.Scanner;

public class PhoneList {

    ArrayList<String> list = new ArrayList<String>();
    boolean foundPrefix = false;
    String[] result;

    public static void main(String[] args) {
	new PhoneList();
    }

    PhoneList() {
	readLines();
	printResult();
    }

    private void readLines() {
	Scanner scan = new Scanner(System.in);
	int numberOfTestCases = Integer.parseInt(scan.nextLine());
	result = new String[numberOfTestCases];
	for (int i = 0; i < numberOfTestCases; i++) {
	    int numberOfNum = Integer.parseInt(scan.nextLine());
	    for (int j = 0; j < numberOfNum; j++) {
		list.add(scan.nextLine());
	    }
	    scanNumbers();
	    if (!foundPrefix) {
		result[i] = "YES";
	    } else {
		result[i] = "NO";
	    }
	    foundPrefix = false;
	    list.clear();
	}

	scan.close();
    }

    private void printResult() {
	for (String string : result) {
	    System.out.println(string);
	}
    }

    private void scanNumbers() {
	for (int i = 0; i < list.size(); i++) {
	    String number = list.get(i);
	    for (int j = 0; j < list.size(); j++) {
		if (number.startsWith(list.get(j)) && i != j) {
		    foundPrefix = true;
		    // System.out.println(number + " == " + list.get(j));
		    break;
		}
	    }
	    if (foundPrefix) {
		break;
	    }
	}
    }

}
