package Areas;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the radius of circle");
   double radius=sc.nextDouble();
   double area=(22*radius*radius)/7;
   System.out.println("Area of circle is : "+area);
   sc.close();
	}

}
