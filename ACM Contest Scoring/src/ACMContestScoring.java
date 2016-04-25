import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project : ACM Contest Scoring 
 * Date : 13 nov. 2015
 * @author : Didrik Lindqvist
 */
public class ACMContestScoring {

    String[] scores = new String[101];
    ArrayList<String> problems = new ArrayList<String>();
    String[] resultScore = new String[101];
    int totalPoints = 0;
    int totalRights = 0;

    public static void main(String[] args) {
	new ACMContestScoring();
    }

    public ACMContestScoring() {

	setScore();
	readScore();
	sumUp();
	printResult();
    }

    private void printResult() {
	System.out.println(totalRights + " " + totalPoints);
    }

    private void readScore() {
	for (String string : problems) {
	    sumUpScoreForProblem(string);
	}
    }

    private void sumUp() {
	for (String string : resultScore) {
	    if (string == null)
		break;
	    string += " ";
	    String[] line = string.split(" ");
	    for (String string2 : line) {
		totalPoints += Integer.parseInt(string2);
	    }
	}
    }

    private void sumUpScoreForProblem(String string) {
	int i = 0;
	boolean solvedQuestios = false;
	while (scores[i] != null) {
	    String[] line = scores[i].split(" ");
	    if (line[1].equals(string)) {
		int index = problems.indexOf(string);
		if (line[2].equals("right")) {
		    totalRights++;
		    solvedQuestios = true;
		    fixPeneltys(index, line[0]);
		    break;
		} else {
		    resultScore[index] += " " + line[0];
		}
	    }
	    i++;
	}
	if (!solvedQuestios) {
	    resultScore[problems.indexOf(string)] = "";
	}
    }

    private void fixPeneltys(int index, String lastMin) {
	int length = resultScore[index].split("").length - 1;

	String[] tmp = resultScore[index].split("");
	int numbOfEntrys = 0;
	for (String string : tmp) {
	    if (string.compareTo(" ") == 0)
		numbOfEntrys++;
	}
	resultScore[index] = "";
	if (length > 0) {
	    resultScore[index] = numbOfEntrys * 20 + " " + lastMin;
	} else {
	    resultScore[index] = lastMin;
	}
    }

    private void setScore() {
	Scanner scan = new Scanner(System.in);
	String string;

	int i = 0;
	while ((string = scan.nextLine()).compareTo("-1") != 0) {
	    resultScore[i] = "";
	    scores[i] = string;
	    String[] line = string.split(" ");
	    if (!problems.contains(line[1])) {
		problems.add(line[1]);
	    }
	    i++;
	}
	scan.close();
    }

}
