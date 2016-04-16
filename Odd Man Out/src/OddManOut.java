import java.util.Hashtable;
import java.util.Scanner;

/**
 * Project : Odd Man Out 
 * Date : 15 nov. 2015
 * @author : Didrik Lindqvist
 */
public class OddManOut {

    private Hashtable<String, Integer> table = new Hashtable<String, Integer>();
    private int[] result;

    public static void main(String[] args) {
	new OddManOut();
    }

    OddManOut() {
	readCasesAndScan();
	printResult();
    }

    private void readCasesAndScan() {
	Scanner scan = new Scanner(System.in);
	int numberOfCases = Integer.parseInt(scan.nextLine());
	result = new int[numberOfCases];
	for (int i = 0; i < numberOfCases; i++) {
	    scan.nextLine(); // Dont need this line.
	    String[] guests = scan.nextLine().split(" ");

	    for (int j = 0; j < guests.length; j++) {
		if (!table.containsKey(guests[j])) {
		    table.put(guests[j], 1);
		} else {
		    table.put(guests[j], 2);
		}
	    }
	    result[i] = scanCases();
	    table.clear();
	}
	scan.close();
    }

    private int scanCases() {
	for (String key : table.keySet()) {
	    if (table.get(key) == 1) {
		return Integer.parseInt(key);
	    }
	}
	return 0;
    }

    private void printResult() {
	int j = 1;
	for (int i : result) {
	    System.out.println("Case #" + j + ": " + i);
	    j++;
	}
    }

}
