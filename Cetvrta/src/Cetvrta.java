import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {
	private ArrayList<String> nodeX;
	private ArrayList<String> nodeY;

	public static void main(String[] args) {
		new Cetvrta();
	}

	Cetvrta() {
		readData();
		printResult();
	}

	private void printResult() {
		System.out.println(nodeX.get(0) + " " + nodeY.get(0));
	}

	private void readData() {
		Scanner scan = new Scanner(System.in);
		nodeX = new ArrayList<String>();
		nodeY = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			String[] node = scan.nextLine().split(" ");

			if (nodeX.contains(node[0])) {
				nodeX.remove(node[0]);
			} else {
				nodeX.add(node[0]);
			}
			if (nodeY.contains(node[1])) {
				nodeY.remove(node[1]);
			} else {
				nodeY.add(node[1]);
			}
		}
		scan.close();
	}

}
