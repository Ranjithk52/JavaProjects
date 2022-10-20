package leapyear;

import java.util.Scanner;

public class LeapYearStatic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		long Yr=sc.nextLong();
		LeapOrNot(Yr);
		

	}

	static void LeapOrNot(long yr)
	{
		if(yr!=0)
		{
		if(yr%400==0)
		{
			System.out.println(yr+" is Leap Year");
		}
		
		else if(yr%100==0)
		{
			System.out.println(yr+" is not a Leap Year");

		}
		else if(yr%4==0)
		{
			System.out.println(yr+" is Leap Year");

		}
		else
		{
			System.out.println(yr+" is not a Leap Year");

		}
		}
		else
		{
			System.out.println("Zero is not a Year");

		}
	}
}
