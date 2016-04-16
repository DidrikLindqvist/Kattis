import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 * 
 * Project : Music your way
 * Class   : Musicyourway.java
 * Date    : 28 feb. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/musicyourway
 */
public class Musicyourway {
    private ArrayList<String> attributes;
    private ArrayList<String> desciptions;
    private ArrayList<String> sortCommands;

    public static void main(String[] args) {
	new Musicyourway();
    }

    Musicyourway() {
	readData();
	analyzeData();
    }

    private void readData() {
	Scanner scan = new Scanner(System.in);
	desciptions = new ArrayList<String>();
	attributes = new ArrayList<String>();
	sortCommands = new ArrayList<String>();
	String[] tmp = scan.nextLine().split(" ");
	for (String string : tmp) {
	    attributes.add(string);
	}
	int numOfSongs = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numOfSongs; i++) {
	    desciptions.add(scan.nextLine());
	}
	int numOfSorts = Integer.parseInt(scan.nextLine());
	for (int i = 0; i < numOfSorts; i++) {
	    sortCommands.add(scan.nextLine());
	}
	scan.close();
    }

    private void analyzeData() {
	for (int i = 0; i < sortCommands.size(); i++) {
	    int index = attributes.indexOf(sortCommands.get(i));
	    desciptions.sort(new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
		    try{
			return Integer.compare(Integer.parseInt(o2), Integer.parseInt(o1));
		    }catch(NumberFormatException e){
			String tmp1 = o1.split(" ")[index];
			String tmp2 = o2.split(" ")[index];
			return tmp1.compareTo(tmp2);
		    }   
		}
	    });
	    for (String string : attributes) {
		System.out.print(string + " ");
	    }
	    System.out.println();
	    for (String string : desciptions) {
		System.out.println(string);
	    }
	    System.out.println();
	}
    }

}
