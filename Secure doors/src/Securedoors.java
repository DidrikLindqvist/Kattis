import java.util.ArrayList;
import java.util.Scanner;
/**
 * Project : Secure doors
 * Class   : Securedoors.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/securedoors
 */
public class Securedoors {
    private ArrayList<String> checkdIn;

    public static void main(String[] args) {
	new Securedoors();
    }

    public Securedoors() {
	readDataAnalyzePrint();
    }

    private void readDataAnalyzePrint() {
	Scanner scan = new Scanner(System.in);
	checkdIn = new ArrayList<String>();
	int numOfLogs = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numOfLogs; i++) {
	    String[] entry = scan.nextLine().split(" ");

	    if (entry[0].equals("entry") && checkdIn.contains(entry[1])) {
		System.out.println(entry[1] + " entered (ANOMALY)");
	    } else if (entry[0].equals("exit")
		    && !checkdIn.contains(entry[1])) {
		System.out.println(entry[1] + " entered (ANOMALY)");
	    } else if (entry[0].equals("entry")) {
		checkdIn.add(entry[1]);
		System.out.println(entry[1] + " entered");
	    } else {
		checkdIn.remove(entry[1]);
		System.out.println(entry[1] + " exited");
	    }
	}
	scan.close();
    }

}
