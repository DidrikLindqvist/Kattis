import java.util.Scanner;

public class TheEasiest {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String line;

	while ((line = scan.nextLine()).compareTo("0") != 0) {
	    int n = Integer.parseInt(line);
	    String[] numbers = line.split("");

	    int nSum = 0;
	    for (String string : numbers) {
		nSum += Integer.parseInt(string);
	    }

	    for (int i = 11; i < 100000; i++) {

		String tmp = Integer.toString(i * n);
		String[] number = tmp.split("");
		int nSum2 = 0;
		for (String string : number) {
		    nSum2 += Integer.parseInt(string);
		}

		if (nSum2 == nSum) {
		    System.out.println(i);
		    break;
		}
	    }
	}

	scan.close();
    }

}
