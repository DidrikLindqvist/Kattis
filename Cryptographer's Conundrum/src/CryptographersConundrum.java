import java.util.Scanner;
/**
 * 
 * Project : Cryptographer's Conundrum
 * Class   : CryptographersConundrum.java
 * Date    : 10 nov. 2015 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/conundrum
 */
public class CryptographersConundrum {
    
    private String characters[];
    private int counter;

    public static void main(String[] args) {
	new CryptographersConundrum();
    }

    CryptographersConundrum() {
	scanData();
	analyzeData();
	printResult();
    }

    private void printResult() {
	System.out.println(counter);
    }

    private void analyzeData() {
	counter = 0;
	for (int j = 0; j < characters.length; j++) {
	    if (characters[j].compareTo("P") != 0)
	    {
		counter++;
	    }
	    if (characters[j + 1].compareTo("E") != 0) 
	    {
		counter++;
	    }
	    if (characters[j + 2].compareTo("R") != 0) 
	    {
		counter++;
	    }
	    j += 2;
	}
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	characters = scan.nextLine().split("");
	scan.close();
    }

}
