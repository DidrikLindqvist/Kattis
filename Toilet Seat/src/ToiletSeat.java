import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Toilet Seat
 * Class   : ToiletSeat.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url: https://open.kattis.com/problems/toilet
 */
public class ToiletSeat {
    private String[] seq;
    private ArrayList<Integer> result;
    
    public static void main(String[] args) {
	new ToiletSeat();
    }

    public ToiletSeat() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	seq = scan.nextLine().split("");
	scan.close();
    }

    private void analyzeData() {
	result = new ArrayList<Integer>();
	analyzePolicieOne();
	analyzePolicieTwo();
	analyzePolicieThree();
    }

    private void analyzePolicieThree() {
	int changes = 0;
	for (int i = 1; i < seq.length; i++) {
	    if (!seq[i - 1].equals(seq[i])) {
		changes += 1;
	    }
	}
	result.add(changes);
    }

    private void analyzePolicieTwo() {
	int changes = 0;
	for (int i = 1; i < seq.length; i++) {
	    if (i == 1) {
		if (seq[0].equals("D") && seq[1].equals("U")) {
		    changes += 2;
		}
		if (seq[0].equals("U")) {
		    changes += 1;
		}
	    } else if (seq[i].equals("U")) {
		changes += 2;
	    }
	}
	result.add(changes);
    }

    private void analyzePolicieOne() {
	int changes = 0;
	for (int i = 1; i < seq.length; i++) {
	    if (i == 1) {
		if (seq[0].equals("U") && seq[1].equals("D")) {
		    changes += 2;
		}
		if (seq[0].equals("D")) {
		    changes += 1;
		}
	    } else if (seq[i].equals("D")) {
		changes += 2;
	    }
	}
	result.add(changes);

    }

    private void printResult() {
	for (Integer integer : result) {
	    System.out.println(integer);
	}
    }
}
