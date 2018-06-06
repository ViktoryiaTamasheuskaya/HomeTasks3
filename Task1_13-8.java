package Tasks;

import java.util.Scanner;

public class Task14 {
private static Scanner sc;
public static void main(String[] args) {
sc = new Scanner(System.in);
int number = 0;

System.out.print("Введите число: ");
if (sc.hasNextInt())
number = sc.nextInt();

getNum(number);
}

public static void getNum (int number) {
int digit;
	while (number != 0) {
digit = number % 10;
number = number / 10;
if (digit % 2 == 0) {
System.out.println("В числе есть четная цифра.");
return;
}
}
System.out.println("В числе нет четных цифр.");
}
}
