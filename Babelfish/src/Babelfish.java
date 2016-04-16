import java.util.Hashtable;
import java.util.Scanner;
/**
 * 
 * Project : Babelfish
 * Class   : Babelfish.java
 * Date    : 31 jan. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/babelfish
 */
public class Babelfish {
    private Hashtable<String, String> dictionary;
    private Scanner scan = new Scanner(System.in);;

    public static void main(String[] args) {
	new Babelfish();
    }

    public Babelfish() {
	dictionary = new Hashtable<String, String>();
	scanData();
	printTranslate();
    }

    private void scanData() {
	do {
	    String[] words = scan.nextLine().split(" ");
	    if (words[0].length() == 0) {
		break;
	    }
	    dictionary.put(words[1], words[0]);
	} while (true);

    }

    private void printTranslate() {

	while (scan.hasNextLine()) {
	    String word = scan.nextLine();
	    if (!dictionary.containsKey(word)) {
		System.out.println("eh");
	    } else {
		System.out.println(dictionary.get(word));
	    }
	}
	scan.close();
    }
}
