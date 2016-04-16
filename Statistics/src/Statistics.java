import java.util.Scanner;
/**
 * 
 * Project : Statistics
 * Class   : Statistics.java
 * Date    : 2 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/statistics
 */
public class Statistics {

    public static void main(String[] args) {
	new Statistics();
    }

    Statistics() {
	scanData();

    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	int i = 1;
	while (scan.hasNextLine()) {
	    int[] data = analyseData(scan.nextLine().split(" "));
	    System.out.println("Case " + i + ": " + data[0] + " " + data[1]
		    + " " + data[2]);
	    i++;
	}
	scan.close();
    }

    private int[] analyseData(String[] data) {
	int max = -999999999;
	int min = 999999999;

	for (int i = 1; i <= Integer.parseInt(data[0]); i++) {

	    if (max < Integer.parseInt(data[i])) {
		max = Integer.parseInt(data[i]);
	    }
	    if (min > Integer.parseInt(data[i])) {
		min = Integer.parseInt(data[i]);
	    }
	}
	int info[] = new int[3];
	info[0] = min;
	info[1] = max;
	info[2] = max - min;

	return info;
    }
}
