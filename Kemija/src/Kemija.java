import java.util.Scanner;

public class Kemija {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		String[]characters =line.split("");
		
		for (int i = 0; i < characters.length; i++) {
			if(characters[i].compareTo("a") == 0)
			{
				characters[i+1] = "";
				characters[i+2] = "";
			}
			if(characters[i].compareTo("e") == 0)
			{
				characters[i+1] = "";
				characters[i+2] = "";
			}
			if(characters[i].compareTo("i") == 0)
			{
				characters[i+1] = "";
				characters[i+2] = "";
			}
			if(characters[i].compareTo("o") == 0)
			{
				characters[i+1] = "";
				characters[i+2] = "";
			}
			if(characters[i].compareTo("u") == 0)
			{
				characters[i+1] = "";
				characters[i+2] = "";
			}
		}
		for (String string : characters) {
			System.out.print(string);
		}
		
		scan.close();
	}

}
