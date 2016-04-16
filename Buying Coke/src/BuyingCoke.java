import java.util.Scanner;

public class BuyingCoke {
    String[] cases;
    int[] result;

    public static void main(String[] args) {
	new BuyingCoke();
    }

    BuyingCoke() {
	scanData();
	for (int i = 0; i < cases.length; i++) {
	    String[] caseInfo = cases[i].split(" ");
	    int cokes = Integer.parseInt(caseInfo[0]);
	    result[i] = calculate(cokes,
		    caseInfo[1] + " " + caseInfo[2] + " " + caseInfo[3]);
	}
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	int numOfCases = Integer.parseInt(scan.nextLine());
	cases = new String[numOfCases];
	result = new int[numOfCases];
	for (int i = 0; i < numOfCases; i++) {
	    cases[i] = scan.nextLine();
	}
	scan.close();

    }

    private int calculate(int cokes, String cokeCase) {
	String[] value = cokeCase.split(" ");
	int ten = Integer.parseInt(value[2]);
	int five = Integer.parseInt(value[1]);
	int one = Integer.parseInt(value[0]);
	return minimumCoins(cokes, one, five, ten);
    }

    private int minimumCoins(int cokes , int one, int five, int ten) {;

    	int turns = 0;
	System.out.println("akr var : " + one);
	System.out.println("aturn : "+turns);
	System.out.println("acola" +cokes);
	for (int i = 0; i < ten; i++) {
	    if(cokes == 0 || ten == 0){
		break;
	    }
	    one += 2;
	    ten--;
	    turns++;
	    cokes--;
	}
	// 15 + 1 kr är bättre än 10 10 10 10 etc. Lös det!
	while(true){
	    if(cokes == 0 || five == 0){
		break;
	    }
	    if(five >= 2){
		five -= 2;
		one += 2;
		turns+= 2;
		cokes--;
	    }else
	    if(five != 0 && one >= 3){
		five -= 1;
		one -= 3;
		cokes--;
		turns+=4;
	    }else{
		break;
	    }
	}
	System.out.println("kr innan 1 : " + one);
	System.out.println("köpta cola : " +cokes);
	System.out.println("turns : "+turns);
	while(true){
	    if(cokes == 0 || one < 8){
		break;
	    }else
	    if(one >= 8){
		one -= 8;
		turns += 8;
		cokes--;
	    }
		System.out.println("kr var : " + one);
		System.out.println("turn : "+turns);
		System.out.println("cola" +cokes);
	}
	System.out.println("kr var : " + one);
	System.out.println("turn : "+turns);
	
	return turns;
    }

    private void printResult() {
	System.out.println("result");
	for (int numb : result) {
	    System.out.println(numb);
	}

    }

}
