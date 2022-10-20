package Areas;

import java.util.Scanner;

class CircleOfArea
{
	double area;
	CircleOfArea(double r)
	{
		 area=(22*r*r)/7;
	}
}
public class CircleAreaUsingConstructer {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radus of circle");
		double radius=sc.nextDouble();
		CircleOfArea obj=new CircleOfArea(radius);
		System.out.println(obj.area);
		sc.close();
	}

}
