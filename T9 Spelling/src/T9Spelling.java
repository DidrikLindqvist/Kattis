import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : T9 Spelling
 * Class   : T9Spelling.java
 * Date    : 31 jan. 2016 
 * @author : Didrik Lindqvist
 * Kattis URL : https://open.kattis.com/problems/t9spelling
 */
public class T9Spelling {

    Hashtable<String, String> keypad;
    String message[];

    public static void main(String[] args) {
	new T9Spelling();
    }

    public T9Spelling() {
	setUpKeyBad();
	readIn();
	calculateMessage();
    }

    private void setUpKeyBad() {
	keypad = new Hashtable<String, String>();
	keypad.put("a", "2");
	keypad.put("b", "22");
	keypad.put("c", "222");
	keypad.put("d", "3");
	keypad.put("e", "33");
	keypad.put("f", "333");
	keypad.put("g", "4");
	keypad.put("h", "44");
	keypad.put("i", "444");
	keypad.put("j", "5");
	keypad.put("k", "55");
	keypad.put("l", "555");
	keypad.put("m", "6");
	keypad.put("n", "66");
	keypad.put("o", "666");
	keypad.put("p", "7");
	keypad.put("q", "77");
	keypad.put("r", "777");
	keypad.put("s", "7777");
	keypad.put("t", "8");
	keypad.put("u", "88");
	keypad.put("v", "888");
	keypad.put("w", "9");
	keypad.put("x", "99");
	keypad.put("y", "999");
	keypad.put("z", "9999");
	keypad.put(" ", "0");
    }

    private void readIn() {
	Scanner scanner = new Scanner(System.in);
	int numOfText = Integer.parseInt(scanner.nextLine());
	message = new String[numOfText];
	for (int i = 0; i < numOfText; i++) {
	    message[i] = scanner.nextLine();
	}
	scanner.close();
    }

    private void calculateMessage() {
	int caseI = 1;
	String messageInNumb = "";
	String lastKey = "";
	for (String string : message) {
	    String messageSplit[] = string.split("");
	    for (String key : messageSplit) {
		if (keypad.get(key).split("")[0]
			.compareTo(lastKey.split("")[0]) == 0) {
		    messageInNumb += " ";
		}
		messageInNumb += keypad.get(key);
		lastKey = keypad.get(key);
	    }

	    System.out.println("Case #" + caseI + ": " + messageInNumb);
	    lastKey = "";
	    messageInNumb = "";
	    caseI++;
	}

    }
}
