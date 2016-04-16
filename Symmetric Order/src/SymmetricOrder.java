import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Symmetric Order
 * Date    : 14 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class SymmetricOrder {

    private ArrayList<String> firstN = new ArrayList<String>();
    private ArrayList<String> lastN = new ArrayList<String>();
    String[] result = new String[101];

    public static void main(String[] args) {
	new SymmetricOrder();
    }

    public SymmetricOrder() {
	setNames();
	printResult();
    }

    public void setNames() {
	Scanner scan = new Scanner(System.in);
	boolean first = true;
	int numberOfNames = 0;
	int j = 0;
	while ((numberOfNames = Integer.parseInt(scan.nextLine())) != 0) {

	    for (int i = 0; i < numberOfNames; i++) {
		String line = scan.nextLine();
		if (first) {
		    firstN.add(line);

		    first = false;
		} else {
		    lastN.add(line);
		    first = true;
		}
	    }
	    fixSet(j);
	    firstN.clear();
	    lastN.clear();
	    first = true;
	    j++;
	}

	scan.close();
    }

    private void fixSet(int index) {
	result[index] = "";
	for (String string : firstN) {
	    result[index] += string + " ";
	}
	for (int i = lastN.size() - 1; i > -1; i--) {
	    result[index] += lastN.get(i) + " ";
	}
    }

    public void printResult() {

	int index = 0;
	while (result[index] != null) {
	    String[] printResult = result[index].split(" ");
	    System.out.println("SET " + (index + 1));
	    for (String string : printResult) {
		System.out.println(string);
	    }
	    index++;
	}

    }
}
