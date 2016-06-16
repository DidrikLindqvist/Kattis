import java.util.Scanner;

public class Ptice {
	private String[] correctAnswers;
	private int brunoCounter = 0;
	private int adrianCounter = 0;
	private int goranCounter = 0;
	private String result = "";

	public static void main(String[] args) {
		new Ptice();
	}

	Ptice() {
		readData();
		analyzeData();
		printResult();
	}

	private void readData() {
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		correctAnswers = scan.nextLine().split("");
		scan.close();
	}

	private void analyzeData() {
		int adrianScore = 0;
		int brunScore = 0;
		int goranScore = 0;
		for (String answer : correctAnswers) {
			adrianScore += checkAnswerAdrian(answer);
			brunScore += checkAnswerBruno(answer);
			goranScore += checkAnswerGoran(answer);
		}
		
		if (adrianScore > brunScore && adrianScore > goranScore) {
			result += adrianScore + "\nAdrian";
		}else
		if (brunScore > adrianScore && brunScore > goranScore) {
			result += brunScore + "\nBruno";
		}else
		if (goranScore > brunScore && goranScore > adrianScore) {
			result += goranScore + "\nGoran";
		}else
		if (goranScore == brunScore && goranScore == adrianScore) {
			result += goranScore + "\nAdrian\nBruno\nGoran";
		}else
		if(goranScore == brunScore && goranScore > adrianScore){
			result += goranScore + "\nBruno\nGoran";
		}else
		if(goranScore == adrianScore && goranScore > brunScore){
			result += goranScore + "\nAdrian\nGoran";
		}else
		if(adrianScore == goranScore && adrianScore > brunScore){
			result += adrianScore + "\nAdrian\nGoran";
		}else
		if(adrianScore == brunScore && adrianScore > goranScore){
			result += adrianScore + "\nAdrian\nBruno";
		}else
		if(brunScore == goranScore && brunScore > adrianScore){
			result += adrianScore + "\nBruno\nGoran";
		}else
		if(brunScore == adrianScore && brunScore > goranScore){
			result += adrianScore + "\nAdrian\nBruno";
		}
		
		// Ćheck all combos..
	}

	private int checkAnswerAdrian(String answer) {
		if (adrianCounter == 3) {
			adrianCounter = 0;
		}
		if (adrianCounter == 0) {
			adrianCounter++;
			return answer.equals("A") ? 1 : 0;
		}
		if (adrianCounter == 1) {
			adrianCounter++;
			return answer.equals("B") ? 1 : 0;
		}
		if (adrianCounter == 2) {
			adrianCounter++;
			return answer.equals("C") ? 1 : 0;
		}
		return 0;// TODO Auto-generated method stub
	}

	private int checkAnswerBruno(String answer) {

		if (brunoCounter == 4) {
			brunoCounter = 0;
		}
		if (brunoCounter == 0) {
			brunoCounter++;
			return answer.equals("B") ? 1 : 0;
		}
		if (brunoCounter == 1) {
			brunoCounter++;
			return answer.equals("A") ? 1 : 0;
		}
		if (brunoCounter == 2) {
			brunoCounter++;
			return answer.equals("B") ? 1 : 0;
		}
		if (brunoCounter == 3) {
			brunoCounter++;
			return answer.equals("C") ? 1 : 0;
		}
		return 0;

	}

	private int checkAnswerGoran(String answer) {
		if (goranCounter == 6) {
			goranCounter = 0;
		}
		if (goranCounter == 0) {
			goranCounter++;
			return answer.equals("C") ? 1 : 0;
		}
		if (goranCounter == 1) {
			goranCounter++;
			return answer.equals("C") ? 1 : 0;
		}
		if (goranCounter == 2) {
			goranCounter++;
			return answer.equals("A") ? 1 : 0;
		}
		if (goranCounter == 3) {
			goranCounter++;
			return answer.equals("A") ? 1 : 0;
		}
		if (goranCounter == 4) {
			goranCounter++;
			return answer.equals("B") ? 1 : 0;
		}
		if (goranCounter == 5) {
			goranCounter++;
			return answer.equals("B") ? 1 : 0;
		}
		return 0;

	}

	private void printResult() {
		System.out.println(result);
	}

}
