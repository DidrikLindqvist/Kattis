import java.util.Scanner;

public class Doorman {
    private int ratioLimit;
    private String[] queue;
    private int result;
    private int women;
    private int men;

    public static void main(String[] args) {
	new Doorman();
    }

    Doorman() {
	scanData();
	analyzeData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	ratioLimit = Integer.parseInt(scan.nextLine());
	queue = scan.nextLine().split("");
	scan.close();

    }

    private void analyzeData() {
	women = 0;
	men = 0;
	for (int i = 0; i < queue.length; i++) {

	    try {
		if (men > women) {

		    if (queue[i].equals("W")) {
			women++;
			System.out.println("let in woman first" + i);
			queue[i] = "n";
		    } else if (queue[i + 1].equals("W")) {
			System.out.println("let in woman second" + i);
			women++;
			queue[i + 1] = "n";
		    }
		} else if (women > men) {
		    if (queue[i].equals("M")) {
			men++;
			System.out.println("let in man first" + i);
			queue[i] = "n";
		    } else if (queue[i + 1].equals("M")) {
			men++;
			System.out.println("let in man second" + i);
			queue[i + 1] = "n";
		    }
		} else {

		    if (queue[i].equals("W")) {
			women++;
			System.out.println("woman");
		    } else {
			System.out.println("man");
			men++;
		    }
		    queue[i] = "n";
		}

	    } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("error ");
	    }
	    System.out.println(Math.abs(women - men));
	    if (Math.abs(women - men) >= ratioLimit) {
		break;
	    } else {
		result++;
	    }
	}

    }

    private void printResult() {
	System.out.println(result);
    }

}
