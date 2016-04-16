import java.util.Scanner;
/**
 * 
 * Project : Quite a problem
 * Class   : Quiteaproblem.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/quiteaproblem
 */
public class Quiteaproblem {

    public static void main(String[] args) {
	new Quiteaproblem();
    }
    
    public Quiteaproblem() {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextLine()){
	    System.out.println(scan.nextLine().toLowerCase().contains("problem") ? "yes" : "no");
	}
	scan.close();
    }

}
