import java.util.ArrayList;
import java.util.Scanner;

public class Synchronizinglists {
    private ArrayList<int[]> list;

    public static void main(String[] args) {
	new Synchronizinglists();
    }

    Synchronizinglists() {
	scanData();
	analyzeData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	list = new ArrayList<int[]>();
	while (true) {
	    int listSize = Integer.parseInt(scan.nextLine());
	    if (listSize == 0) {
		break;
	    }
	    int[] listOne = new int[listSize];
	    for (int i = 0; i < listSize; i++) {
		listOne[i] = Integer.parseInt(scan.nextLine());
	    }
	    int[] listTwo = new int[listSize];
	    for (int i = 0; i < listSize; i++) {
		listTwo[i] = Integer.parseInt(scan.nextLine());
	    }
	    list.add(listOne);
	    list.add(listTwo);
	}
	System.out.println("done");
	System.out.println(list.size());
	scan.close();
    }

    private void analyzeData() {
	// TODO Auto-generated method stub
    }

    private void printResult() {
	// TODO Auto-generated method stub
    }
}
