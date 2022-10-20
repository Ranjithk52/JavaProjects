package fundamentals;

import java.util.Scanner;

/**
 * 
 * @author rk22032
 *find the largest number
 */

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number?");
		int firstnumber = sc.nextInt();
		System.out.println("Enter Second number?");
		int secondnumber = sc.nextInt();
		System.out.println("Enter Third number?");
		int thirdnumber = sc.nextInt();
		if(firstnumber>secondnumber && firstnumber>thirdnumber) 
		{
		System.out.println("First number is Largest number");
		}
		if(secondnumber>firstnumber && secondnumber>thirdnumber) 
		{
		System.out.println("Second number is Largest number");
		}
		if(thirdnumber>secondnumber && thirdnumber>firstnumber)
		{
		System.out.println("Third number is Largest number");
		}
		else
		System.out.println("Two or more numbers are equal");



		sc.close();
	}

}
