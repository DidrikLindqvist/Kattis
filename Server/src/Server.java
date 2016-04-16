import java.util.Scanner;

/**
 * 
 * Project : Server Date : 11 nov. 2015
 * 
 * @author : Didrik Lindqvist
 */
public class Server {

	public static void main(String[] args) {
		new Server();
	}

	int numberOfTasks = 0;
	int totalRunTime = 0;
	String[] tasks;
	int currentTotalTime = 0;
	int result = 0;

	Server() {
		readTasks();
		calculateTime();
		printResult();
	}

	private void printResult() {
		System.out.println(result);

	}

	private void calculateTime() {
		for (int i = 0; i < numberOfTasks; i++) {
			if ((Integer.parseInt(tasks[i]) + currentTotalTime) <= totalRunTime) {
				currentTotalTime += Integer.parseInt(tasks[i]);
				result++;
			}

			else
				break;
		}

	}

	private void readTasks() {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		numberOfTasks = Integer.parseInt(line[0]);
		totalRunTime = Integer.parseInt(line[1]);
		tasks = new String[numberOfTasks];
		tasks = scan.nextLine().split(" ");
		scan.close();

	}

}
