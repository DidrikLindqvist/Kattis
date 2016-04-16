import java.util.Scanner;
/**
 * 
 * Project : Just a Minute
 * Class   : JustaMinute.java
 * Date    : 27 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/justaminute
 */
public class JustaMinute {
    private double obsSeconds;
    private double slMinutes;

    public static void main(String[] args) {
	new JustaMinute();
    }

    JustaMinute() {
	scanData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	int obs = Integer.parseInt(scan.nextLine());
	obsSeconds = 0;
	slMinutes = 0;
	for (int i = 0; i < obs; i++) {
	    String[] observation = scan.nextLine().split(" ");
	    obsSeconds += Long.parseLong(observation[1]);
	    slMinutes += Long.parseLong(observation[0]);
	}
	scan.close();
    }

    private void printResult() {
	double result = obsSeconds / (slMinutes * 60);
	if (result <= 1) {
	    System.out.println("measurement error");
	} else {
	    System.out.format("%.9f", result);

	}
    }
}
