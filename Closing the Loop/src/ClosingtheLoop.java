import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
/**
 * 
 * Project : Closing the Loop
 * Class   : ClosingtheLoop.java
 * Date    : 27 feb. 2016 
 * @author : Didrik Lindqvist¨
 * Kattis url : https://open.kattis.com/problems/closingtheloop
 */
public class ClosingtheLoop {
    private ArrayList<String[]> cases;
    private ArrayList<Integer> redRopes;
    private ArrayList<Integer> blueRopes;
    private ArrayList<Integer> results;

    public static void main(String[] args) {
	new ClosingtheLoop();
    }

    ClosingtheLoop() {
	scanData();
	analyzeData();
	printResult();
    }

    private void printResult() {
	int index = 1;
	for (Integer result : results) {
	    System.out.println("Case #" + index + ": " + result);
	    index++;
	}
    }

    private void analyzeData() {
	redRopes = new ArrayList<Integer>();
	blueRopes = new ArrayList<Integer>();
	results = new ArrayList<Integer>();
	for (String[] cCase : cases) {
	    for (int i = 0; i < cCase.length; i++) {

		if (cCase[i].contains("R")) {

		    redRopes.add(Integer.parseInt(cCase[i].replace("R", "")));
		} else {

		    blueRopes.add(Integer.parseInt(cCase[i].replace("B", "")));
		}
	    }
	    sortRopes();
	    creatKnots();
	    redRopes.clear();
	    blueRopes.clear();
	}

    }

    private void creatKnots() {
	Iterator<Integer> iB = blueRopes.iterator();
	Iterator<Integer> iR = redRopes.iterator();
	int result = 0;
	int knots = 0;
	while (iB.hasNext() && iR.hasNext()) {
	    int blue = iB.next();
	    int red = iR.next();
	    if (blue - 0.5 >= 0 && red - 0.5 >= 0) {
		result += (blue + red) - 1;
		knots++;
	    } else {
		break;
	    }
	}
	if (result >= 1) {
	    results.add(result - (knots));
	} else {
	    results.add(result);
	}

    }

    private void sortRopes() {
	redRopes.sort(new Comparator<Integer>() {
	    @Override
	    public int compare(Integer arg0, Integer arg1) {
		return Integer.compare(arg1, arg0);
	    }
	});

	blueRopes.sort(new Comparator<Integer>() {
	    @Override
	    public int compare(Integer arg0, Integer arg1) {
		return Integer.compare(arg1, arg0);
	    }
	});
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	cases = new ArrayList<String[]>();
	int numOfCases = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numOfCases; i++) {
	    /* Don't need */
	    scan.nextLine();
	    String ropes[] = scan.nextLine().split(" ");
	    cases.add(ropes);
	}
	scan.close();

    }

}
