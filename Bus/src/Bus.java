import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : Bus
 * Class   : Bus.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/bus
 */
public class Bus {
    private ArrayList<Integer> list;
    private Hashtable<Integer, Integer> calcBus;

    public static void main(String[] args) {
	new Bus();
    }

    Bus() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	list = new ArrayList<Integer>();
	int numbOfCases = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numbOfCases; i++) {
	    list.add(Integer.parseInt(scan.nextLine()));
	}
	scan.close();
    }

    private void analyzeData() {
	int tmp = 1;
	calcBus = new Hashtable<Integer, Integer>();
	calcBus.put(0, 0);
	calcBus.put(1, 1);
	for (int i = 2; i <= 30; i++) {
	    tmp = tmp * 2 + 1;
	    calcBus.put(i, tmp);
	}
    }

    private void printResult() {
	for (Integer askedInt : list) {
	    System.out.println(calcBus.get(askedInt));
	}
    }

}
