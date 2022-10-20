package leapyear;

import java.util.Scanner;

public class LeapYearTernary {

	public static void main(String[] args) 
	{
		int a,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Year");
long  year=sc.nextLong();
if(year!=0)
{
	a=(year%400==0)?(c=1):((year%100==0)?(c=0):((year%4==0)?(c=1):(c=0)));
	if(a==1)
	{
		System.out.println(year+" is Leap Year");
	}
	else
	{
		System.out.println(year+" is not a Leap Year");
	}
	
}
	}

}
