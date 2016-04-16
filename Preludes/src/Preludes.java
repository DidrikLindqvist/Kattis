import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/chopin 
 * Project : Preludes 
 * Date : 15 nov. 2015
 * @author : Didrik Lindqvist
 */
public class Preludes {
    private Hashtable<String, String> table = new Hashtable<String, String>();
    private ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {
	new Preludes();
    }

    Preludes() {
	initateNotes();
	readNotes();
	PrintResult();
    }

    private void PrintResult() {
	for (String string : list) {
	    System.out.println(string);
	}
    }

    private void initateNotes() {
	table.put("A", "UNIQUE");
	table.put("A#", "Bb");
	table.put("Bb", "A#");
	table.put("B", "UNIQUE");
	table.put("C", "UNIQUE");
	table.put("C#", "Db");
	table.put("Db", "C#");
	table.put("D", "UNIQUE");
	table.put("D#", "Eb");
	table.put("Eb", "D#");
	table.put("E", "UNIQUE");
	table.put("F", "UNIQUE");
	table.put("F#", "Gb");
	table.put("Gb", "F#");
	table.put("G", "UNIQUE");
	table.put("G#", "Ab");
	table.put("Ab", "G#");
    }

    private void readNotes() {
	Scanner scan = new Scanner(System.in);
	int i = 1;
	while (scan.hasNext()) {
	    String[] line = scan.nextLine().split(" ");
	    if (table.get(line[0]).compareTo("UNIQUE") == 0) {
		list.add("Case " + i + ": " + table.get(line[0]));
	    } else {
		list.add("Case " + i + ": " + table.get(line[0]) + " "
			+ line[1]);
	    }

	    i++;
	}
	scan.close();
    }
}
