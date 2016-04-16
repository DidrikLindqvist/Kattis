import java.util.Scanner;

/**
 * 
 * Project : Spavanac
 * Date    : 10 nov. 2015 
 * @author : Didrik Lindqvist
 */
public class Spavanacc {
	int hour;
	int min;
	
	public static void main(String[] args) {
		new Spavanacc();
	}
	
	public Spavanacc() {
		setTime();
		setAlarm();
		getAlarm();
	}
	private void getAlarm() {
		System.out.println(hour + " " + min);
		
	}

	private void setAlarm() {
		if((min - 45) < 0)
		{
			min = 60 + (min - 45);
			if((hour - 1) < 0)
			{
				hour = 23;
			}else{
				hour -= 1;
			}
			
		}else{
			min -= 45;
		}
	}

	public void setTime()
	{
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		min = scan.nextInt();
		scan.close();
	}

}
