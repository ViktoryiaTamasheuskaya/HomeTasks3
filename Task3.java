package Tasks;

import java.util.Scanner;

public class Task3 {
	
	private static Scanner sc;

	public static void main (String[] args) {
		double x=0,Fx;
		System.out.println("Vvedite x");
		sc = new Scanner(System.in);
		if (sc.hasNextDouble()) {
			x=sc.nextDouble();}		
		
		if (x>3){
			Fx=1/(Math.pow(x, 2)+1);
		
		System.out.println("Fx= "+Fx);	}
		else {
			if (x<=-3) {
			Fx=9;
			System.out.println("Fx= "+Fx);	
		}
		else {System.out.println("Введите число <=-3 или >3");
			
			}
		
		}
		
	}
	
}
