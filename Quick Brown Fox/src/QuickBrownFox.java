import java.util.Scanner;

public class QuickBrownFox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfLines = Integer.parseInt(scan.nextLine());
		String[] lines = new String[numOfLines];
		for(int i = 0; i < numOfLines; i++)
		{
			lines[i] = scan.nextLine();
		}
		String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int[][] missingChars = new int[lines.length][27];

		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if(!lines[i].toLowerCase().contains(chars[j]))
					missingChars[i][j] = 1;
				else
					missingChars[i][j] = 0;
			}
		}
		boolean ok = true;
		for (int i = 0; i < lines.length; i++) {
			String missing = "missing ";
			ok = true;
			for (int j = 0; j < chars.length; j++) {
				if(missingChars[i][j] == 1)
				{
					missing = missing + chars[j];
					ok = false;
				}		
						
				if(j == chars.length-1 && ok)
					System.out.println("pangram");
				else if(j == chars.length-1 && !ok)
					System.out.println(missing);
			}
		}
			
		scan.close();
	}

}
