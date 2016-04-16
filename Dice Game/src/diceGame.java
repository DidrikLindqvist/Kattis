import java.util.Scanner;

public class diceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] result = new int[2];
		int tmp;
		int tmp2;
		for(int i = 0; i < 2 ; i ++)
		{
			String line = scan.nextLine();
			String[] numbers = line.split(" ");
			int firstNumb = Integer.parseInt(numbers[0]);
			int secondNumb = Integer.parseInt(numbers[1]);
			int thirdNumb = Integer.parseInt(numbers[2]);
			int FourthNumb = Integer.parseInt(numbers[3]);
		
			tmp = 0;
			tmp2 = 0;
			
			if(firstNumb != 1)
			{
				tmp = firstNumb - 1;
			}
			if(thirdNumb != 1)
			{
				tmp2 = thirdNumb - 1;
			}
			
			result[i]= secondNumb + FourthNumb + firstNumb + thirdNumb;
			
		}
		
		if(result[0] == result[1])
		{
			System.out.println("Tie");
		}else if(result[0] > result[1])
		{
			System.out.println("Gunnar");
		}else{
			System.out.println("Emma");
		}
		
		scan.close();
	}

}
