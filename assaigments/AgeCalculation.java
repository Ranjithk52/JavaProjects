package assaigments;

import java.util.Scanner;

public class AgeCalculation 
{
static double calculateAge(int birthyear,int birthmonth)
{
	int age=2022-birthyear;
	double age1=(double)(12*age+birthmonth)/12;
	if(birthyear<1 || birthmonth<1) {
		return -1;
	}
	else if(birthmonth>6 && birthyear>2022)
	{
		return -2;
	}
	else
		return age1;
	
	
	
}
	
	
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter birth year");
int birthYear=sc.nextInt();
System.out.println("Enter birth month");
int birthMonth=sc.nextInt();
System.out.println(calculateAge(birthYear,birthMonth));
	}

}
