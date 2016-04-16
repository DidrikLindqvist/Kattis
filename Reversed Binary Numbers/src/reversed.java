import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reversed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String binary = Integer.toBinaryString(scan.nextInt());
		System.out.println(binary);
		String after = new StringBuilder(binary).reverse().toString();
		
		// To get it in base 2
		int res = Integer.parseInt(after,2);
		
		System.out.println(res);
		
	}

}
