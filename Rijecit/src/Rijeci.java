import java.util.Scanner;

/**
 * Project : Rijecit Date : 10 nov. 2015
 * 
 * @author : Didrik Lindqvist
 */
public class Rijeci {

    private int numberOfClicks = 0;
    private int counterA = 0;
    private int counterB = 0;
    String result = "A";

    public static void main(String[] args) {
	new Rijeci();
    }

    public Rijeci() {
	setSettings();
	calculateClicks2();
    }
    public void fixString(){
	
    }
    public void calculateClicks2() {
	for (int i = 0; i < numberOfClicks; i++) {
	    result = result.replace('A', 'B');
	    result = result.replace("B", "BA");
	   // result = result.replaceAll("A", "B");
	   // result = result.replaceAll("B", "BA");
	    System.out.println(result);
	}
	System.out.println("Done");
	String[] tmp = result.split("");
	for (int i = 0; i < tmp.length; i++) {
	    if (tmp[i].compareTo("A") == 0)
		counterA++;
	    else
		counterB++;
	}

	System.out.println(counterA + " " + counterB);
    }

    public void calculateClicks() {
	for (int i = 0; i < numberOfClicks; i++) {
	    String[] tmp = result.split("");
	    String merge = "";

	    for (int j = 0; j < tmp.length; j++) {
		if (tmp[j].compareTo("A") == 0)
		    merge += "B";
		else {
		    merge += "AB";
		}
	    }
	    result = merge;
	}
	System.out.println("Done");
	String[] tmp = result.split("");
	for (int i = 0; i < tmp.length; i++) {
	    if (tmp[i].compareTo("A") == 0)
		counterA++;
	    else
		counterB++;
	}

	System.out.println(counterA + " " + counterB);
    }

    public void setSettings() {
	Scanner scan = new Scanner(System.in);
	numberOfClicks = scan.nextInt();
	scan.close();
    }
}
