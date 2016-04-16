import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Cd {

    ArrayList<Integer> jack = new ArrayList<Integer>();
    ArrayList<Integer> jill = new ArrayList<Integer>();

    int counter = 0;

    public static void main(String[] args) {
	new Cd();
    }

    public Cd() {

	setTables();
    }

    public void printResult() {
	System.out.println(counter);
    }

    public void countSame() {
	for (int i = 0; i < jack.size(); i++) {
	    int tmp = jack.get(i);
	    if (jill.contains(tmp))
		counter++;
	}

    }

    public void setTables() {
	Scanner scan = new Scanner(System.in);
	String string = scan.nextLine();
	int jackOwns = Integer.parseInt(string.split(" ")[0]);
	while (scan.hasNextLine()) {
	    String info = scan.nextLine();
	    if (info.equals("0 0")) {
		countSame();
		printResult();
		jill.clear();
		jack.clear();
		counter = 0;

		if (scan.hasNextLine()) {
		    String string2 = scan.nextLine();
		    jackOwns = Integer.parseInt(string2.split(" ")[0]);
		} else {
		    break;
		}

	    } else if (jackOwns <= 0) {
		jill.add(Integer.parseInt(info));
	    } else {
		jack.add(Integer.parseInt(info));
		jackOwns--;
	    }

	}

	scan.close();
    }

}
