import java.util.Scanner;
/**
 * https://open.kattis.com/problems/carrots
 * Project : Solving for Carrots
 * Date    : 18 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Carrot {

    private int score = 0;

    public static void main(String[] args) {
	new Carrot();
    }

    Carrot() {
	readCarrots();
	printResult();
    }

    private void readCarrots() {
	Scanner scan = new Scanner(System.in);
	String[] numbers = scan.nextLine().split(" ");
	int contesters = Integer.parseInt(numbers[0]);
	score = Integer.parseInt(numbers[1]);

	for (int i = 0; i < contesters; i++) {
	    scan.nextLine();
	}
	scan.close();
    }

    private void printResult() {
	System.out.println(score);
    }

}
