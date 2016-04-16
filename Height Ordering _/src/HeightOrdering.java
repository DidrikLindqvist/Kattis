import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * Project : Height Ordering 
 * Date    : 11 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class HeightOrdering {

	private String[] lengths;
	private String[] result;
	private int numberOfClasses;
	ArrayList<Integer> orderQuee = new ArrayList<Integer>();
	int numberOfMoves = 0;
	public static void main(String[] args) {
		new HeightOrdering();
	}
	
	HeightOrdering()
	{
		readHeights();
		calculateSteps();
		printResult();
	}
	
	private void readHeights() {
		Scanner scan = new Scanner(System.in);
		numberOfClasses = Integer.parseInt(scan.nextLine());
		lengths = new String[numberOfClasses];
		for (int i = 0; i < numberOfClasses; i++) {
			lengths[i] = scan.nextLine();
		}
		scan.close();
	}
	
	private void calculateSteps() {
		result = new String[numberOfClasses];
		
		for (int i = 0; i < numberOfClasses; i++) {
			String[] line = lengths[i].split(" ");
			
			for (int j = 1; j < line.length; j++) { // for the lengths
				rightOrdercheck(Integer.parseInt(line[j]));
			}
			
			result[i] = line[i] + " " + numberOfMoves;
			numberOfMoves = 0;
			orderQuee.clear();
		}
		
	}
	private void rightOrdercheck(int length)
	{
		
		int size = orderQuee.size();
		if(size == 0) // If its the first kid
			orderQuee.add(length);
		
		for (int i = 0; i < size; i++) { // checks the kids already in line.
			if(orderQuee.get(i) > length){		
				numberOfMoves +=  orderQuee.size() - (i);
				orderQuee.add(i, length);
				break;
			}else if(i == (size-1))
			{
				orderQuee.add(i, length);
			}	
		}
	}
	
	private void printResult() {
		for (String string : result) {
			System.out.println(string);
		}
	}
}
