import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Ants
 * Class   : Ants.java
 * Date    : 29 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/ants
 */
public class Ants {
    private ArrayList<String> posistions;
    private ArrayList<String> result;
    private ArrayList<String[]> info;

    public static void main(String[] args) {
	new Ants();
    }

    public Ants() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	posistions = new ArrayList<String>();
	info = new ArrayList<String[]>();
	int numTestCases = Integer.parseInt(scan.nextLine());    
	
	for (int i = 0; i < numTestCases; i++) {
	    info.add(scan.nextLine().split(" "));
	    int j = 0;
	    String allAnts = "";
	    int max = Integer.parseInt(info.get(i)[1]);
	    while (j < max) {
		String tmp = scan.nextLine();
		j += tmp.split(" ").length;
		allAnts += tmp + " ";
	    }
	    posistions.add(allAnts);
	}
	scan.close();
    }

    private void analyzeData() {
	result = new ArrayList<String>();
	
	for (int i = 0; i < info.size(); i++) {

	    int poleLength = Integer.parseInt(info.get(i)[0]);
	    int smallestRange = 99999999;
	    int shortest = 0;
	    int biggest = -4;
	    int smallest = 99999999;
	    String[] pos = posistions.get(i).split(" ");
	    for (int j = 0; j < pos.length; j++) {
		int curPos = Integer.parseInt(pos[j]);
		if (curPos > biggest) {
		    biggest = curPos;
		}
		if (curPos < smallest) {
		    smallest = curPos;
		}
		if (Math.abs(curPos - (poleLength / 2)) < smallestRange) {
		    smallestRange = Math.abs(curPos - (poleLength / 2));
		    shortest = curPos;
		}
	    }
	    int longestNumb = Math.abs(smallest - poleLength) > biggest
		    ? Math.abs(smallest - poleLength) : biggest;
	    int shortestNumb = shortest > poleLength / 2 ? poleLength - shortest
		    : shortest;
	    result.add(shortestNumb + " " + longestNumb);
	}
    }

    private void printResult() {
	for (String results : result) {
	    System.out.println(results);
	}
    }

}
