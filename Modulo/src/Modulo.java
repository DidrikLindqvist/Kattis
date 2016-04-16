import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    private ArrayList<Integer> list;
    public static void main(String[] args) {
	new Modulo();
    }
    
    Modulo(){
	scanData();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	list = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
	    int key = Integer.parseInt(scan.nextLine()) % 42;
	    if(!list.contains(key)){
		list.add(key);
	    }
	}
	System.out.println(list.size());
	scan.close();
    }
}
