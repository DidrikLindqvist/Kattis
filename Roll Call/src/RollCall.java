import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RollCall {
    private Hashtable<String, String> names;
    private ArrayList<String> result;

    public static void main(String[] args) {
	new RollCall();
    }

    RollCall() {
	readData();
	printResult();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	names = new Hashtable<String, String>();
	while (scan.hasNextLine()) {
	    String[] curName = scan.nextLine().split(" ");
	    if (names.containsKey(curName[0])) {
		String firstName = curName[0];
		String lastName = names.get(curName[0]);
		names.remove(curName[0]);
		names.put(firstName + " " + lastName, lastName);
		names.put(curName[0] + " " + curName[1], curName[1]);
	    } else {
		names.put(curName[0], curName[1]);
	    }
	}
	scan.close();
    }

    @SuppressWarnings("unchecked")
    private void printResult() {
	@SuppressWarnings("rawtypes")
	java.util.Vector vec = new java.util.Vector(names.values());
	Collections.sort(vec);
	for (Object object : vec) {
	    String obj = (String) object;
	    System.out.println("OBJECT TO CHECK FOR : "+obj);
	    int counter = 0;
	    for (String name : names.keySet()) {
		System.out.println("name : "+name+" obj : " + obj);
		if(name.contains(obj)){
		    System.out.println(name);
		    counter++;
		    break;
		}
	    }
	    if(counter == 0){
		System.out.println(obj);
	    }else{
		counter = 0;
	    }
	}

    }
}
