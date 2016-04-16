import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ptrees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfTrees = Integer.parseInt(scan.nextLine());
		String splitNumbers = scan.nextLine();
		String[] numbers = splitNumbers.split(" ");
		
		if(numberOfTrees != 0)
        {
			int[]trees = new int[numberOfTrees];
			
					
			for(int i = 0; i < numberOfTrees; i++)
			{
				trees[i] = Integer.parseInt(numbers[i]);
			}
        
			Arrays.sort(trees);
			
			int daysToParty = 0;
	        int daysLeft = 0;
	        int i = 0;
	        for(int day = numberOfTrees-1; day >= 0; day--) {
	            trees[day] -= numberOfTrees - i;
	            daysToParty++;
	            i++;
	        }
	        for(int day = numberOfTrees-1; day >= 0; day--) {
	            if (trees[day] > daysLeft)
	                daysLeft = trees[day];
	        }
	        daysToParty += daysLeft;
	        System.out.println(daysToParty+2);
        	
        }else{
        	System.out.println("2");
        }
       
        
        
		scan.close();
	}

}
