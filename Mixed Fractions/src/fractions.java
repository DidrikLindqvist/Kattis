import java.util.Scanner;

public class fractions {

	public static void main(String[] args) {
		int first;
		int second;
		Scanner scan = new Scanner(System.in);
		while((first = scan.nextInt()) != 0 && (second = scan.nextInt()) != 0)
		{				
			int res = first % second;		
			int res2 = first / second;
			
			System.out.println(res2+" "+res+" / "+second);
		}
		scan.close();
	}
}
