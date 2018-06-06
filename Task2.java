package Tasks;

import java.util.Scanner;

public class Task2 {


	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in); 
		int x=0,b=0,h=0;
		double Fx = 0;
		 System.out.print("ведите a: ");
		  if (in.hasNextInt()) {x=in.nextInt();}
		  System.out.print("ведите b: ");
		  if (in.hasNextInt()) {b=in.nextInt();}
		  System.out.print("ведите h: ");
		  if (in.hasNextInt()) {h=in.nextInt();}
		  
		  	  
			if (x>b) { 
				  System.out.println("a должен быть меньше чем b");
				 {  
			if (h>b) { 
				  System.out.println("h должен быть меньше чем b");
				  String s2=in.next();	
          }	
				  }
			  }
			  else  do {
				  Fx=(2*(Math.tan(x/2)))+1;
				  System.out.println("---------------");
				  System.out.println("x=" + x + " |" + " F(x)=" + Math.floor(Fx) + " |") ;
				  x=++h;
			  
	}
			  while (x != b);	  
	}
	}
