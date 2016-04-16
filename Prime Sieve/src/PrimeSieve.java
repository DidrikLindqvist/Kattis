import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : Prime Sieve
 * Class   : PrimeSieve.java
 * Date    : 31 jan. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/primesieve
 */
public class PrimeSieve {

    private int priceNumb;
    private int numbOfLines;
    private ArrayList<Integer> primeTable;
    private String[] isPrime;

    public static void main(String[] args) {
	new PrimeSieve();
    }

    public PrimeSieve() {
	primeTable = new ArrayList<Integer>();
	scanData();
	calcPrime();
	printResult();
    }

    private void printResult() {
	System.out.println(primeTable.size());
	for (String numb : isPrime) {
	    if (primeTable.contains(Integer.parseInt(numb))) {
		System.out.println("1");
	    } else {
		System.out.println("0");
	    }
	}

    }

    private void calcPrime() {

	for (int i = 2; i <= priceNumb; i++) {
	    if (prime(i, i / 2) == 1) {
		primeTable.add(i);
	    }
	}
    }

    private int prime(int num, int i) {
	if (i == 1) {
	    return 1;
	}
	if (num % i == 0) {
	    return 0;
	} else {
	    return prime(num, i - 1);
	}

    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	String[] info = scan.nextLine().split(" ");
	priceNumb = Integer.parseInt(info[0]);
	numbOfLines = Integer.parseInt(info[1]);
	isPrime = new String[numbOfLines];
	for (int i = 0; i < numbOfLines; i++) {
	    isPrime[i] = scan.nextLine();
	}
	scan.close();

    }
}
