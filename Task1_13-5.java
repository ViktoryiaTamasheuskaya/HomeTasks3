package Tasks;

import java.util.Scanner;


public class Task11 {  
	
	public static String min = "";
  public static String max = "";
    
public static void main(String[] args) {   
		
	findResults();
	resultsOutput(); 
	}
		
	public static void findResults () {
		
		int n = 5;
		Scanner sc = new Scanner(System.in);   
		int i=0;
		  
		String str="";
		for (i = 0; i < n; i++) {    
			System.out.print("> ");    
			if (sc.hasNextLine()) {     
			str = sc.nextLine(); 
			if (i == 0) {
	            min = str;
	        } else {
			findMaxString(str);
			findMinString(str);
	        }
			}			  
		}
	}
    

	public static void findMaxString (String str) {
		
		if (str.length() > max.length()) {      
			max = str; 
			} 
	}
		
	public static void findMinString (String str)	{
		
		if (str.length() < min.length()) {      
			min = str;     
			}  
	}
	
	public static void resultsOutput () {
		
		System.out.println("max string = " + max + " length=" + max.length());   
		System.out.println("min string = " + min + " length=" + min.length());
		  
		} 
	} 

