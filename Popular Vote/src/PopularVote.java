import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Popular Vote
 * Class   : PopularVote.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/vote
 */
public class PopularVote {
    private ArrayList<String> results;

    public static void main(String[] args) {
	new PopularVote();
    }

    PopularVote() {
	readData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	results = new ArrayList<String>();
	int numbOfCases = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numbOfCases; i++) {
	    int numbOfCandidate = Integer.parseInt(scan.nextLine());
	    int maxVotes = -1;
	    String maxVoteNumb = "";
	    int totVotes = 0;
	    boolean noWinner = false;
	    for (int j = 0; j < numbOfCandidate; j++) {
		int elVotes = Integer.parseInt(scan.nextLine());
		if (elVotes > maxVotes) {
		    maxVoteNumb = Integer.toString(j + 1);
		    maxVotes = elVotes;
		    noWinner = false;
		} else if (elVotes == maxVotes) {
		    noWinner = true;
		}
		totVotes += elVotes;
	    }
	    if (noWinner) {
		results.add("no winner");
	    } else if (maxVotes > totVotes - maxVotes) {
		results.add("majority winner " + maxVoteNumb);
	    } else {
		results.add("minority winner " + maxVoteNumb);
	    }
	}

	scan.close();
    }

    private void printResult() {
	for (String result : results) {
	    System.out.println(result);
	}
    }

}
