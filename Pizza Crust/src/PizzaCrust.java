import java.util.Scanner;

public class PizzaCrust {

	public static void main(String[] args) {
		new PizzaCrust();
	}
	
	public PizzaCrust() {
		readDataAndSolve();
	}

	private void readDataAndSolve() {
		Scanner scan = new Scanner(System.in);
		String[] pizzaMessure = scan.nextLine().split(" ");
		double totalRadie = Double.parseDouble(pizzaMessure[0]);
		double crustRadie = totalRadie - Double.parseDouble(pizzaMessure[1]);
		double res = crustRadie * crustRadie * Math.PI / (totalRadie*totalRadie*Math.PI);
		System.out.println(res*100);
		scan.close();
	}


}
