import java.util.Scanner;
/**
 * https://open.kattis.com/problems/pauleigon
 * Project : Paul Eigon
 * Date    : 16 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class PaulEigon {

    public static void main(String[] args) {
	new PaulEigon();
    }

    private int numOfServers;
    private int scoreP;
    private int scoreO;
    private int server = 0; // 0 paul and 1 opponent

    PaulEigon() {
	readCurrentPingisState();
	scanState();
	printResult();
    }

    private void readCurrentPingisState() {
	Scanner scan = new Scanner(System.in);
	String[] line = scan.nextLine().split(" ");
	numOfServers = Integer.parseInt(line[0]);
	scoreP = Integer.parseInt(line[1]);
	scoreO = Integer.parseInt(line[2]);
	scan.close();
    }

    private void scanState() {
	int mergedScore;
	if ((scoreP + scoreO) > 10) {
	    mergedScore = (scoreP + scoreO) % 10;
	} else {
	    mergedScore = (scoreP + scoreO);
	}
	System.out.println(mergedScore);
	mergedScore -= numOfServers;
	while (mergedScore >= 0) {

	    if (server == 0) {
		server = 1; // opponent
	    } else {
		server = 0; // pauls turn
	    }
	    mergedScore -= numOfServers;
	}
    }

    private void printResult() {
	if (server == 0) {
	    System.out.println("paul");
	} else {
	    System.out.println("opponent");
	}
    }

}
