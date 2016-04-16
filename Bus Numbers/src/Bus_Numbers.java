import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * Project : Bus Numbers
 * Class   : Bus_Numbers.java
 * Date    : 27 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/busnumbers
 */
public class Bus_Numbers {
    private ArrayList<Integer> busses;
    private ArrayList<String> result;

    public static void main(String[] args) {
	new Bus_Numbers();
    }

    Bus_Numbers() {
	scanData();
	analyzeData();
	printResult();
    }

    private void printResult() {
	for (String chain : result) {
	    System.out.print(chain + " ");
	}

    }

    private void analyzeData() {
	result = new ArrayList<String>();
	sortBusses();
	int chain = 0;

	for (int i = 0; i < busses.size(); i++) {
	    int currBuss = busses.get(i);
	    try {

		if (currBuss + 1 == busses.get(i + 1)) {
		    chain++;
		} else if (chain >= 2) {
		    result.add(busses.get(i - chain) + "-" + busses.get(i));
		    chain = 0;
		} else if (chain == 1){
		    result.add(Integer.toString(busses.get(i-1)));
		    result.add(Integer.toString(busses.get(i)));
		    chain = 0;
		}else{
		    result.add(Integer.toString(busses.get(i)));
		    chain = 0;
		}
	    } catch (IndexOutOfBoundsException e) {
		if (chain >= 2) {
		    result.add(busses.get(i - chain) + "-" + busses.get(i));
		}else if (chain == 1){
		    result.add(Integer.toString(busses.get(i-1)));
		    result.add(Integer.toString(busses.get(i)));
		    chain = 0;
		} else {
		    result.add(Integer.toString(busses.get(i)));
		}
	    }
	}
    }

    private void sortBusses() {
	busses.sort(new Comparator<Integer>() {
	    @Override
	    public int compare(Integer o1, Integer o2) {
		return Integer.compare(o1, o2);
	    }
	});
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	/* Don't need */
	scan.nextLine();
	String[] bussesS = scan.nextLine().split(" ");
	busses = new ArrayList<Integer>();
	for (int i = 0; i < bussesS.length; i++) {
	    busses.add(Integer.parseInt(bussesS[i]));
	}
	scan.close();
    }

}
