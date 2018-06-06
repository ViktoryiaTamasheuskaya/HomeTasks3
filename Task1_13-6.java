package Tasks;

import java.util.Scanner;

public class Task12 {
private static Scanner sc;

public static void main(String[] args) {

sc = new Scanner(System.in);
int number = 0;

System.out.print("Введите число: ");
if (sc.hasNextInt()) {
number = sc.nextInt();
}
getposlZifra(number);
getposlZifraKv(number);

}

public static int getposlZifra (int number) {
	int poslZifra = number % 10;
	return poslZifra;
}

public static void getposlZifraKv (int number) {
	int poslZifraKv = 0;
	switch (number) {
	case 0:
	poslZifraKv = 0;
	break;
	case 1:
	poslZifraKv = 1;
	break;
	case 2: 
	poslZifraKv = 4;
	break;
	case 3:
	poslZifraKv = 9;
	break;
	case 4:
	poslZifraKv = 6;
	break;
	case 5:
	poslZifraKv = 5;
	break;
	case 6:
	poslZifraKv = 6;
	break;
	case 7:
	poslZifraKv = 9;
	break;
	case 8:
	poslZifraKv = 4;
	break;
	case 9:
	poslZifraKv = 1;
	break;
	default:
	System.out.println("Что-то не то с программой.");
	System.exit(0);
	
}
	System.out.println("Квадрат числа " + number + " равняется " + 
			poslZifraKv);
	
}
}
