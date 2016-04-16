import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Pervasive Heart Monitor
 * Class   : PervasiveHeartMonitor.java
 * Date    : 27 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/pervasiveheartmonitor
 */
public class PervasiveHeartMonitor {
    private ArrayList<String[]> logs;
    private ArrayList<String> result;

    public static void main(String[] args) {
	new PervasiveHeartMonitor();
    }

    PervasiveHeartMonitor() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	logs = new ArrayList<String[]>();
	while (scan.hasNextLine()) {
	    logs.add(scan.nextLine().split(" "));
	}
	scan.close();
    }

    private void analyzeData() {
	result = new ArrayList<String>();
	NumberFormat formatter = new DecimalFormat("#0.000000");
	for (String[] log : logs) {
	    String name = "";
	    double hr = 0;
	    int records = 0;
	    for (int i = 0; i < log.length; i++) {
		if (log[i].matches(".*\\d+.*")) {
		    hr += Double.parseDouble(log[i]);
		    records++;
		} else {
		    name += log[i] + " ";
		}
	    }
	    result.add(formatter.format(hr / records) + " " + name);
	}
    }

    private void printResult() {
	for (String log : result) {
	    System.out.println(log);
	}

    }

}
