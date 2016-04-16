import java.util.Scanner;
/**
 * 
 * Project : Alphabet Spam
 * Date    : 10 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class AlphabetSpam {
	private String text = "";
	String[] highLetter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String[] lowLetter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	int low = 0;
	int high = 0;
	int white = 0;
	int symbol = 0;
	public static void main(String[] args) {
		new AlphabetSpam();
	}
	
	public AlphabetSpam(){
		redLine();
		parseString();
		printResult();
	}

	private void parseString() {
		white = replaceAll("_");	
		for (int i = 0; i < lowLetter.length; i++) {
			low += replaceAll(lowLetter[i]);
		}
		for (int i = 0; i < highLetter.length; i++) {
			high += replaceAll(highLetter[i]);
		}
		symbol = text.length();
	}
	
	private void printResult()
	{
		double total = low + high + white + symbol;
		System.out.println(white/total);
		System.out.println(low/total);
		System.out.println(high/total);
		System.out.println(symbol/total);
	}
	public int replaceAll(String string)
	{
		int tmpstart = text.length();
		text = text.replace(string, "");
		return tmpstart - text.length();
	}

	private void redLine() {
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		scan.close();
	}

}
