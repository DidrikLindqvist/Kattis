import java.util.Scanner;

public class EraseSecurely {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfSwitch = Integer.parseInt(scan.nextLine());
		String[] beforeLine = scan.nextLine().split("");
		String afterLine = scan.nextLine();
		int[] bits = new int[beforeLine.length];
		
		for (int i = 0; i < beforeLine.length; i++) {
			bits[i] = Integer.parseInt(beforeLine[i]);
		}

		for (int i = 0; i < numberOfSwitch; i++) {
			for (int k = 0; k < bits.length; k++) {
				if(bits[k] == 0)
					bits[k] = 1;
				else
					bits[k] = 0;	
			}
		}
		String result = "";
		for (int i : bits) {
			result += i;
		}

		if(result.compareTo(afterLine) == 0)
			System.out.println("Deletion succeeded");
		else
			System.out.println("Deletion failed");
		scan.close();
	}

}
