import java.util.Scanner;

/**
 * Project : A Different Problem 
 * Date : 14 nov. 2015
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/different
 */
public class dProb {
    public static void main(String[] args) {
		new dProb();
    }

    dProb() {
		scanStuff();
    }

    private void scanStuff() {
	Scanner scan = new Scanner(System.in);

	while (scan.hasNextLine()) {
	    String line = scan.nextLine();
	    String[] numbers = line.split(" ");

	    long firstNumb = Long.parseLong(numbers[0]);
	    long secondNumb = Long.parseLong(numbers[1]);

	    if (secondNumb > firstNumb) {
		System.out.println(secondNumb - firstNumb);
	    } else {
		System.out.println(firstNumb - secondNumb);
	    }
	}
	scan.close();
    }
}
