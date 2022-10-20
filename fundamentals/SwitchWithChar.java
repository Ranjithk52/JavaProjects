package fundamentals;

import java.util.Scanner;

public class SwitchWithChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number?");
		System.out.println("--------------------");
		System.out.println("|Switch Application|");
		System.out.println("|a. Addition       |");
		System.out.println("|b.Subtraction     |");
		System.out.println("|c.Multiplication  |");
		System.out.println("|d.Division        |");
		System.out.println("--------------------");
		System.out.println("Enter your choice number");
		int choice = sc.next().charAt(0);
		System.out.println("Enter number A?");
		int a = sc.nextInt();
		System.out.println("Enter number B?");
		int b = sc.nextInt();
		switch(choice) {
		case 'a':
		System.out.println("Result= "+(a+b));
		break;
		case 'b':
		System.out.println("Result= "+(a-b));
		break;
		case 'c':
		System.out.println("Result= "+(a*b));
		break;
		case 'd':
		System.out.println("Result= "+(a/b));
		break;
		default:
		System.out.println("Enter Choice in the given range a-d");
		}
		sc.close();
		}
	}


