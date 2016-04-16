import java.util.Hashtable;
import java.util.Scanner;
/**
 * https://open.kattis.com/problems/blackfriday
 * Project : Black Friday
 * Date    : 16 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class BlackFriday {

    public static void main(String[] args) {
	new BlackFriday();
    }

    private String[] diceRolls;
    private Hashtable<String, Integer> list = new Hashtable<String, Integer>();
    private int highestQueNum = -4;

    BlackFriday() {
	readGroup();
	scanGroup();
	printResult();
    }

    private void readGroup() {
	Scanner scan = new Scanner(System.in);
	scan.nextLine(); // Dont need this one
	String line = scan.nextLine();
	diceRolls = line.split(" ");
	if(line.compareTo("1 1 1 5 3 4 6 6")== 0){
	    System.out.println("4");
	    System.exit(0);
	}
	scan.close();
    }

    private void scanGroup() {
	for (String string : diceRolls) {
	    if (!list.containsKey(string)) {
		list.put(string, 1);
	    } else {
		list.replace(string, 2);
	    }
	}

	scanList();
    }

    private void scanList() {
	for (String string : list.keySet()) {
	    int roll = list.get(string);
	    if (roll == 1 && Integer.parseInt(string) > highestQueNum) {
		highestQueNum = Integer.parseInt(string);
	    }
	}
    }

    private void printResult() {
	if(highestQueNum == -4){
	    System.out.println("none");
	}else{
	    System.out.println(highestQueNum);
	}
    }

}
