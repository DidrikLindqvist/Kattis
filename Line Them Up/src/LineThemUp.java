
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * Project : Line Them Up
 * Date    : 13 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class LineThemUp {
    private int numberOfNames;
    private String[] names;
    boolean increaseChecker = false;
    boolean decreseChecker = false;
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
	new LineThemUp();
    }

    public LineThemUp() {
	readNames();
	scanName();
	printResult();
    }

    private void readNames() {
	Scanner scan = new Scanner(System.in);
	numberOfNames = Integer.parseInt(scan.nextLine());
	names = new String[numberOfNames];
	for (int i = 0; i < numberOfNames; i++) {
	    names[i] = scan.nextLine();
	    list.add(names[i]);
	}
	scan.close();
    }

    private void scanName() {

	Comparator<String> comp = null;
	list.sort(comp);
	for (int i = 0; i < numberOfNames; i++) {

	    if (!increaseChecker && !checkIncresing(list.get(i), i)) {
		increaseChecker = true;
	    }

	    if (!decreseChecker && !chekDecresing(list.get(i), i)) {
		decreseChecker = true;
	    }
	}

    }

    private boolean checkIncresing(String name, int index) {
	return names[index].compareTo(name) == 0;
    }

    private boolean chekDecresing(String name, int index) {

	if (0 == (numberOfNames - index))
	    return names[0].compareTo(name) == 0;
	return names[(numberOfNames - 1) - index].compareTo(name) == 0;
    }

    private void printResult() {

	if (increaseChecker && decreseChecker) {
	    System.out.println("NEITHER");
	} else if (!increaseChecker && decreseChecker) {
	    System.out.println("INCREASING");
	} else {
	    System.out.println("DECREASING");
	}
    }
}
