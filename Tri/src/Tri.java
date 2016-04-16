import java.util.Scanner;
/**
 * 
 * Project : Tri
 * Class   : Tri.java
 * Date    : 10 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Tri {

    private String line;

    public static void main(String[] args) {
	new Tri();
    }

    Tri() {
	readLine();
	scanLine();
    }

    private void scanLine() {
	String[] numbers = line.split(" ");
	int one = Integer.parseInt(numbers[0]);
	int two = Integer.parseInt(numbers[1]);
	int three = Integer.parseInt(numbers[2]);
	checkAddition(one, two, three);
	checkSubtraction(one, two, three);
	checkMultiplication(one, two, three);
	checkDivision(one, two, three);
    }

    private void checkAddition(int one, int two, int three) {
	if (one + two == three) {
	    System.out.println(one + "+" + two + "=" + three);
	    System.exit(0);
	} else if (one == two + three) {
	    System.out.println(one + "=" + two + "+" + three);
	    System.exit(0);
	}
    }

    private void checkSubtraction(int one, int two, int three) {
	if (one - two == three) {
	    System.out.println(one + "-" + two + "=" + three);
	    System.exit(0);
	} else if (one == two - three) {
	    System.out.println(one + "=" + two + "-" + three);
	    System.exit(0);
	}
    }

    private void checkMultiplication(int one, int two, int three) {
	if (one * two == three) {
	    System.out.println(one + "*" + two + "=" + three);
	    System.exit(0);
	} else if (one == two * three) {
	    System.out.println(one + "=" + two + "*" + three);
	    System.exit(0);
	}
    }

    private void checkDivision(int one, int two, int three) {
	if (one / two == three) {
	    System.out.println(one + "/" + two + "=" + three);
	    System.exit(0);
	} else if (one == two / three) {
	    System.out.println(one + "=" + two + "/" + three);
	    System.exit(0);
	}
    }

    private void readLine() {
	Scanner scan = new Scanner(System.in);
	line = scan.nextLine();
	scan.close();
    }

}
