import java.util.Scanner;
/**
 * 
 * Project : Simon Says
 * Class   : SimonSays.java
 * Date    : 31 jan. 2016 
 * @author : Didrik Lindqvist
 * Kattis url: https://open.kattis.com/problems/simon
 */
public class SimonSays {

    public static void main(String[] args) {
	new SimonSays();
    }

    SimonSays() {
	doCommands();
    }

    private void doCommands() {
	Scanner scan = new Scanner(System.in);
	int numOfCom = Integer.parseInt(scan.nextLine());

	for (int i = 0; i < numOfCom; i++) {
	    String[] command = scan.nextLine().split(" ");
	    
	    if (command.length > 2 &&  command[0].equals("simon") && command[1].equals("says")) {
		for (int j = 2 ; j < command.length; j++) {
		    System.out.print(command[j] + " ");
		}
		
	    } else {
		System.out.println("");
	    }
	}
	scan.close();
    }

}
