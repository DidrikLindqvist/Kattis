import java.util.Scanner;
/**
 * https://open.kattis.com/problems/aaah
 * Project : Aaah!
 * Date    : 08 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Aaah {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int patient = scan.nextLine().length() - 1;
	int doctor = scan.nextLine().length() - 1;

	if (patient >= doctor) {
	    System.out.println("go");
	} else {
	    System.out.println("no");
	}
	scan.close();
    }

}
