package Areas;

import java.util.Scanner;

interface Area_Cal
{
	void circle(double r);
}
public class CircleInterface implements Area_Cal 
{
	double area;
	public void circle(double r)
	{
		area=(22*r*r)/7;
	}

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Radius: ");
double radius=sc.nextDouble();
CircleInterface obj=new CircleInterface();
obj.circle(radius);
System.out.println(obj.area);

	}

}
