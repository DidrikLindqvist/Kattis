import java.util.Scanner;

/**
 * Project : ICPC Tutorial
 * Date    : 10 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class ICPCTutorial {
	int t = 0;
	int m = 0;
	int n = 0;
	double result = 0;
	public static void main(String[] args) {
		new ICPCTutorial();
	}
	
	public ICPCTutorial() {
		
		setComplexity();
		switch (t) {
		case 1:
			checkIf1();
			break;
		case 2:
			checkIf2();
			break;
		case 3:
			checkIf3();
			break;
		case 4:		
			checkIf4();
			break;
		case 5:
			checkIf5();
			break;
		case 6:
			checkIf6();
			break;
		case 7:
			checkIf7();
			break;
			
		default:
			System.out.println("Wrong type input.");
			break;
		}
	}
	
	private void setComplexity()
	{
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		t = scan.nextInt();
		scan.close();
	}
	private void printResult()
	{
		if(result <= m)
		{
			System.out.println("AC");
		}else{
			System.out.println("TLE");
		}
	}
	private void checkIf1(){ // O(n!)
    	result = n;
		for (int i = n-1; i != 0; i--) {
			result *= i;
			if(result > m)
				break;
		}
		printResult();
	}
	private void checkIf2(){ // O(2^n)
		result = 2;
		for (int i = n-1; i != 0; i--) {
			result *= 2;
			if(result > m)
				break;
		}
		printResult();
	}
	private void checkIf3(){ // O(n^4)
		int tmp = n;
		result = n;
		for (int i = 0; i < 3; i++) {
			result *= tmp;
			if(result > m)
				break;
		}
		printResult();
	}
	private void checkIf4(){ // O(n^3)
		result = n;
		int tmp = n;
		for (int i = 0; i < 2; i++) {
			result *= tmp;
			if(result > m)
				break;
		}
		printResult();
	}
	private void checkIf5(){ // O(n^2)
		result = n;
		for (int i = 0; i < 1; i++) {
			result *= result;
		}
		printResult();
	}
	private void checkIf6(){ // O(n*log2(n))
		result = n * (Math.log(n)/Math.log(2));	
		printResult();	
	}
	private void checkIf7(){ // O(n)
		result = n;
		printResult();
	}

}
