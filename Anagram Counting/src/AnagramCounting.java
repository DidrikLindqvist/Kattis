import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : Anagram Counting
 * Class   : AnagramCounting.java
 * Date    : 29 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/anagramcounting
 */
public class AnagramCounting {
    private ArrayList<String> wordList;
    private ArrayList<Long> result;
    private Hashtable<String, Integer> container;

    public static void main(String[] args) {
	new AnagramCounting();
    }

    public AnagramCounting() {
	readData();
	analyzeData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	wordList = new ArrayList<String>();
	while (scan.hasNextLine()) {
	    wordList.add(scan.nextLine());
	}
	System.out.println("done added  ");
	scan.close();
    }

    private void analyzeData() {
	result = new ArrayList<Long>();
	container = new Hashtable<String,Integer>();
	for (String word : wordList) {
	    String letters[] = word.split("");
	    for (String letter : letters) {
		if(!container.containsKey(letter)){
		    container.put(letter, 1);
		}else{
		    int val = container.get(letter);
		    
		    container.replace(letter, val + 1);
		}
	    }
	    long number = factorial(letters.length);
	    System.out.println(number);
	    int tot = 1;
	    for (String string : letters) {
		tot *= factorial(container.get(string));
		System.out.println(container.get(string));
		System.out.println(factorial(container.get(string)));
	    }
	    result.add(number/tot);
	}

	
    }

    private Long factorial(int n) {
	BigInteger sum = BigInteger.valueOf(0);
	int fact = 1;
	for (long i = 1; i <= n; i++) {
	    sum = sum.multiply(BigInteger.valueOf(i));
	}
	return sum.longValueExact();
    }

    private void printResult() {
	for (Long res : result) {
	    System.out.println(res);
	}
    }

}
