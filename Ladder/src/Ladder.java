import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		double angle = scan.nextInt();
		angle = (angle*Math.PI/180);
		int result = 0;
		if(angle % 1 != 0) 
			result = (int) ( height/Math.sin(angle))+1;
		else
			result = (int) ( height/Math.sin(angle));
		System.out.println(result);
		
		scan.close();
	}

}
