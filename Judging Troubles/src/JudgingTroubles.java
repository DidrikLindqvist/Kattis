import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 * 
 * Project : Judging Troubles
 * Class   : JudgingTroubles.java
 * Date    : 31 jan. 2016 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/judging
 */
public class JudgingTroubles {
    HashMap<String, Integer> domJudge;
    HashMap<String, Integer> kattis;

    public static void main(String[] args) {
	new JudgingTroubles();
    }

    JudgingTroubles() {
	domJudge = new HashMap<String, Integer>();
	kattis = new HashMap<String, Integer>();
	scanData();
	printResult();
    }

    private void scanData() {
	Scanner scan = new Scanner(System.in);
	int numbOfSub = Integer.parseInt(scan.nextLine());

	for (int i = 0; i < numbOfSub * 2; i++) {
	    String result = scan.nextLine();
	    if(!domJudge.containsKey(result)){
		domJudge.put(result,0);
		kattis.put(result,0);
	    }
	    if (i < numbOfSub) {
		domJudge.put(result,domJudge.get(result)+1);
	    } else {
		kattis.put(result,kattis.get(result)+1);
	    }
	}
	scan.close();
    }

    private void printResult() {
	int resSum = 0;
	for (String result : domJudge.keySet()) {
	    int corrDum = domJudge.get(result);
	    int corrKat = kattis.get(result);
	    int resCorr = corrDum > corrKat ? corrKat : corrDum;
	    resSum += resCorr;
	}
	System.out.println(resSum);
    }

}
