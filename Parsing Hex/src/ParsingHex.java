import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Project : Parsing Hex Class : ParsingHex.java Date : 5 feb. 2016
 * 
 * @author : Didrik Lindqvist Kattis url :
 *         https://open.kattis.com/problems/parsinghex
 */
public class ParsingHex {
    ArrayList<String> lines;
    ArrayList<String> result;

    public static void main(String[] args) {
	new ParsingHex();
    }

    ParsingHex() {
	scanData();
	analyzeData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	lines = new ArrayList<String>();
	while (scan.hasNextLine()) {
	    lines.add(scan.nextLine());
	}
	scan.close();
    }

    private void analyzeData() {
	result = new ArrayList<String>();
	for (String line : lines) {
	    analyzeLine(line.split(""));
	}
    }

    private void analyzeLine(String[] split) {

	for (int i = 0; i < split.length - 2; i++) {

	    if ((split[i] + split[i + 1]).equals("0x")
		    || (split[i] + split[i + 1]).equals("0X") && !(split[i+2]+split[i+3]).toLowerCase().equals("0x")) {
		String hexLine = "";
		int j = i;
		while(j < split.length-2) {
		    if (split[j+2].matches("[a-fA-f0-9]")) {
			hexLine += split[j+2];
		    }else{
			break;
		    }
		    j++;
		}
		
		if(hexLine.length() >= 1){
		    result.add(split[i] + split[i + 1]);
		    result.add(hexLine);
		}
		
		i += hexLine.length()+2;
	    }

	}
    }

    private void printResult() {
	for (int i = 0; i < result.size(); i++) {
	    
	    System.out.println(result.get(i) + result.get(i + 1) + " "
		    +hex2decimal(result.get(i+1)));
	   
	    i++;
	}
    }
    
    private int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
