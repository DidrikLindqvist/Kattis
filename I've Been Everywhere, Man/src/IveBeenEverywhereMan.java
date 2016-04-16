import java.util.ArrayList;
import java.util.Scanner;
/**
 * https://open.kattis.com/problems/everywhere
 * Project : I've Been Everywhere, Man
 * Date    : 16 nov. 2015 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/everywhere
 */
public class IveBeenEverywhereMan {
    private ArrayList<String> list = new ArrayList<String>();
    private int[] result;

    public static void main(String[] args) {
	new IveBeenEverywhereMan();
    }

    IveBeenEverywhereMan() {
	readCitys();
	printResult();
    }

    private void readCitys() {
	Scanner scan = new Scanner(System.in);
	int numOfTestCases = Integer.parseInt(scan.nextLine());
	result = new int[numOfTestCases];
	for (int i = 0; i < numOfTestCases; i++) {
	    int numOfCitys = Integer.parseInt(scan.nextLine());
	    for (int j = 0; j < numOfCitys; j++) {
		String city = scan.nextLine();
		if (!list.contains(city)) {
		    list.add(city);
		}
	    }
	    analyzeUniquCitys(i);
	}
	scan.close();
    }

    private void analyzeUniquCitys(int i) {
	result[i] = list.size();
	list.clear();
    }

    private void printResult() {
	for (int citys : result) {
	    System.out.println(citys);
	}
    }
}
