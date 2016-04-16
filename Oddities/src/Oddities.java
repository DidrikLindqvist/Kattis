import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfTest = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numberOfTest; i++)
		{
			int testNumber = Integer.parseInt(scan.nextLine());
			if(testNumber%2 == 0)
			{
				System.out.println(testNumber+" is even");
			}else{
				System.out.println(testNumber+" is odd");
			}
		}
		scan.close();

	}

}
