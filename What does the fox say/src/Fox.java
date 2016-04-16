import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : What does the fox say
 * Class   : Fox.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/whatdoesthefoxsay
 */
public class Fox {
    private ArrayList<String[]> results;

    public static void main(String[] args) {
	new Fox();
    }

    Fox() {
	readData();
	printResult();
    }

    private void printResult() {
	for (String[] foxSays : results) {
	    for (int i = 0; i < foxSays.length; i++) {
		if (!foxSays[i].equals("*")) {
		    System.out.print(foxSays[i] + " ");
		}
	    }
	}
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	results = new ArrayList<String[]>();
	int numbOfCases = Integer.parseInt(scan.nextLine());
	while (numbOfCases != 0) {
	    String sounds = scan.nextLine();
	    String animal = "";
	    while (!(animal = scan.nextLine())
		    .equals("what does the fox say?")) {
		sounds = sounds.replaceAll("\\b" + animal.split(" ")[2] + "\\b",
			"*");
	    }
	    results.add(sounds.split(" "));
	    numbOfCases--;
	}
	scan.close();
    }

}
