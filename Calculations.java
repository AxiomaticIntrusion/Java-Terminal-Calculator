import java.util.Scanner;

public class Calculations extends Calculator {
	public void restart() {
		Calculator RESTART = new Calculator();
		double op2, res;
		System.out.println("Want to restart?");
		System.out.println("Yes: 1");
		System.out.println("No: 2");
		Scanner res1 = new Scanner(System.in);
		op2 = res1.nextDouble();
		
		if(op2 == 1) {
			RESTART.selections();
		} else if(op2 == 2) {
			System.exit(0);
		}
		
		
	}
}
