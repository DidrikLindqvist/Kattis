import java.util.Hashtable;
import java.util.Scanner;

public class Bela {

	private Hashtable<String, Integer> scoreTableDominant;
	private Hashtable<String, Integer> scoreTableNotDominant;
	private int totalScore = 0;

	public static void main(String[] args) {
		new Bela();
	}

	Bela() {
		createScoreTables();
		setUpDominantTable();
		setUpNoneDominantTable();
		readInputAndSolve();
		printResult();
	}

	private void createScoreTables() {
		scoreTableDominant = new Hashtable<String, Integer>();
		scoreTableNotDominant = new Hashtable<String, Integer>();
	}

	private void setUpNoneDominantTable() {
		scoreTableNotDominant.put("A", 11);
		scoreTableNotDominant.put("K", 4);
		scoreTableNotDominant.put("Q", 3);
		scoreTableNotDominant.put("J", 2);
		scoreTableNotDominant.put("T", 10);
		scoreTableNotDominant.put("9", 0);
		scoreTableNotDominant.put("8", 0);
		scoreTableNotDominant.put("7", 0);
	}

	private void setUpDominantTable() {
		scoreTableDominant.put("A", 11);
		scoreTableDominant.put("K", 4);
		scoreTableDominant.put("Q", 3);
		scoreTableDominant.put("J", 20);
		scoreTableDominant.put("T", 10);
		scoreTableDominant.put("9", 14);
		scoreTableDominant.put("8", 0);
		scoreTableDominant.put("7", 0);
	}

	private void readInputAndSolve() {
		Scanner scan = new Scanner(System.in);
		String[] startInfo = scan.nextLine().split(" ");
		int numOfHands = Integer.parseInt(startInfo[0]) * 4;
		String dominant = startInfo[1];

		for (int i = 0; i < numOfHands; i++) {
			String[] hand = scan.nextLine().split("");
			if (hand[1].compareTo(dominant) == 0) {
				totalScore += scoreTableDominant.get(hand[0]);
			} else {
				totalScore += scoreTableNotDominant.get(hand[0]);
			}
		}

		scan.close();
	}

	private void printResult() {
		System.out.println(totalScore);
	}

}
