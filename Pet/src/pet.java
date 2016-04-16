import java.util.Scanner;

public class pet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]persons = new int[5];
		int winner = -4;
		int winnerscore = -4;
		for(int i = 0 ; i < 5 ; i++)
		{
			String line = scan.nextLine();
			String[] numbers = line.split(" ");
			int firstNumb = Integer.parseInt(numbers[0]);
			int secondNumb = Integer.parseInt(numbers[1]);
			int thirdNumb = Integer.parseInt(numbers[2]);
			int FourthNumb = Integer.parseInt(numbers[3]);
			persons[i] = firstNumb + secondNumb + thirdNumb + FourthNumb;
			if(persons[i] > winnerscore)
			{
				winner = i+1;
				winnerscore = persons[i];
			}
		}
		System.out.println(winner+" "+winnerscore);
		scan.close();
	}
}
