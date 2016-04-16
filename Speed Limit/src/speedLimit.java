import java.util.Scanner;

public class speedLimit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int numberOfLines = scan.nextInt();
		
		int[]speed = new int[numberOfLines];
		int[]distance = new int[numberOfLines];
		int totalMiles = 0;
		while(true)
		{		
			for(int i = 0; i < numberOfLines; i++)
			{
				speed[i] = scan.nextInt();
				distance[i] = scan.nextInt();
				
				if(i == 0)
				{
					totalMiles = distance[0]*speed[0];
				}else{
					totalMiles +=  (distance[i]-distance[i-1])* speed[i];
				}
			}
			System.out.println(totalMiles+" miles");
			numberOfLines = scan.nextInt();
			if(numberOfLines == -1)
				break;
			speed = new int[numberOfLines];
			distance = new int[numberOfLines];

		}

		scan.close();
	}

}
