import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Happy Happy Prime Prime
 * Class   : HappyPrime.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/happyprime
 */
public class HappyPrime {
    private int[] primes;
    private ArrayList<String> results;

    public static void main(String[] args) {
	new HappyPrime();
    }

    HappyPrime() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	int numOfCases = Integer.parseInt(scan.nextLine());
	primes = new int[numOfCases];
	for (int i = 0; i < numOfCases; i++) {
	    primes[i] = Integer.parseInt(scan.nextLine().split(" ")[1]);
	}
	scan.close();
    }

    private void analyzeData() {
	results = new ArrayList<String>();
	for (int i = 0; i < primes.length; i++) {
	    results.add(
		    i + 1 + " " + primes[i] + " " + checkHappyPrime(primes[i]));
	    System.out.println(results.get(i));
	}
    }

    private String checkHappyPrime(int prime) {
	int numb = prime;
	int turns = 0;
	if (!isPrime(prime) || prime == 1) {
	    return "NO";
	}
	while (true) {
	    String[] numbersS = Integer.toString(numb).split("");
	    int tot = 0;
	    for (int i = 0; i < numbersS.length; i++) {
		int number = Integer.parseInt(numbersS[i]);
		tot += number * number;
	    }
	    if (tot == 1) {
		return "YES";
	    } else if (turns >= 10) {
		return "NO";
	    }
	    numb = tot;
	    turns++;
	}
    }

    boolean isPrime(int n) {
	for (int i = 2; i < n; i++) {
	    if (n % i == 0)
		return false;
	}
	return true;
    }

    private void printResult() {
	// TODO Auto-generated method stub

    }

}
