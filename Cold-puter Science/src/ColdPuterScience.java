import java.util.Scanner;
/**
 * https://open.kattis.com/problems/cold
 * Project : Cold-puter Science
 * Date    : 15 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class ColdPuterScience {

    public static void main(String[] args) {
	new ColdPuterScience();
    }

    private String temps;
    private int numOfColdDays = 0;

    ColdPuterScience() {
	readTempatures();
	scanTempatures();
	printResult();
    }

    private void readTempatures() {
	Scanner scan = new Scanner(System.in);
	scan.nextLine(); // Dont need this one.
	temps = scan.nextLine();
	scan.close();
    }

    private void scanTempatures() {
	String[] tempatures = temps.split(" ");
	for (String string : tempatures) {
	    if (Integer.parseInt(string) < 0) {
		numOfColdDays++;
	    }
	}
    }

    private void printResult() {
	System.out.println(numOfColdDays);
    }

}
