import java.util.Scanner;
/**
 * 
 * Project : Volim
 * Class   : Volim.java
 * Date    : 3 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/volim
 */
public class Volim {
    private int currPlayer;
    private String[] turns;

    public static void main(String[] args) {
	new Volim();
    }

    Volim() {
	scanData();
	analyzeData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	currPlayer = Integer.parseInt(scan.nextLine());
	int numbOfTurns = Integer.parseInt(scan.nextLine());
	turns = new String[numbOfTurns];
	for (int i = 0; i < numbOfTurns; i++) {
	    turns[i] = scan.nextLine();
	}
	scan.close();

    }

    private void analyzeData() {
	int time = 0;
	for (String string : turns) {
	    String[] info = string.split(" ");
	    time += Integer.parseInt(info[0]);
	    if (time >= 210) {
		break;
	    } else if (info[1].equals("T")) {
		nextPlayerIncement();
	    }
	}
    }

    private void nextPlayerIncement() {
	currPlayer = currPlayer == 8 ? 1 : currPlayer + 1;
    }

    private void printResult() {
	System.out.println(currPlayer);
    }

}
