import java.util.Scanner;

public class Fridaythe13th {

    public static void main(String[] args) {
	new Fridaythe13th();
    }
    private int numOfTestCases;
    private String[][] years = new String[21][101];;
    
    Fridaythe13th(){
	readInfo();
	scanInfo();
	printResults();
    }

    private void readInfo() {
	Scanner scan = new Scanner(System.in);
	numOfTestCases = Integer.parseInt(scan.nextLine());
	
	for (int i = 0; i < numOfTestCases; i++) {
	    years[i][0] = scan.nextLine();
	    years[i][1] = scan.nextLine();
	}
	scan.close();
    }

    private void scanInfo() {
	// TODO Auto-generated method stub
	
    }

    private void printResults() {
	// TODO Auto-generated method stub
	
    }

}
