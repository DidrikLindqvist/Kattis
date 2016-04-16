import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : Vauvau
 * Class   : Vauvau.java
 * Date    : 26 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/vauvau
 */
public class Vauvau {
    private Hashtable<Integer, String> moodChecker;
    private String[] humInterval;
    private int dogOneMadFor;
    private int dogOneRestFor;
    private int dogTwoMadFor;
    private int dogTwoRestFor;

    public static void main(String[] args) {
	new Vauvau();
    }

    Vauvau() {
	readData();
	analyzeData();
	printResult();
    }

    private void printResult() {
	for (int i = 0; i < humInterval.length; i++) {
	    System.out
		    .println(moodChecker.get(Integer.parseInt(humInterval[i])));
	}
    }

    private void analyzeData() {
	moodChecker = new Hashtable<Integer, String>();
	boolean dogOneMad = dogOneMadFor != 0 ? true : false;
	boolean dogTwoMad = dogTwoMadFor != 0 ? true : false;
	int dogOneCounter = dogOneMadFor;
	int dogTwoCounter = dogTwoMadFor;
	for (int i = 1; i < 999; i++) {
	    if (dogOneCounter == 0 && dogOneMad) {
		dogOneMad = false;
		dogOneCounter = dogOneRestFor;
	    } else if (dogOneCounter == 0 && !dogOneMad) {
		dogOneMad = true;
		dogOneCounter = dogOneMadFor;
	    }
	    if (dogTwoCounter == 0 && dogTwoMad) {
		dogTwoMad = false;
		dogTwoCounter = dogTwoRestFor;
	    } else if (dogTwoCounter == 0 && !dogTwoMad) {
		dogTwoMad = true;
		dogTwoCounter = dogTwoMadFor;
	    }
	    if (dogOneMad && dogTwoMad) {
		moodChecker.put(i, "both");
	    } else if (dogOneMad && !dogTwoMad || !dogOneMad && dogTwoMad) {
		moodChecker.put(i, "one");
	    } else {
		moodChecker.put(i, "none");
	    }
	    dogOneCounter--;
	    dogTwoCounter--;
	}
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	String[] dogsInterval = scan.nextLine().split(" ");
	dogOneMadFor = Integer.parseInt(dogsInterval[0]);
	dogOneRestFor = Integer.parseInt(dogsInterval[1]);
	dogTwoMadFor = Integer.parseInt(dogsInterval[2]);
	dogTwoRestFor = Integer.parseInt(dogsInterval[3]);
	humInterval = scan.nextLine().split(" ");
	scan.close();
    }

}
