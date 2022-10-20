package Areas;

import java.util.Scanner;

class AreaCal
	{
		double area;
	  void Areacircles (double r)	
	  {
		   
		   area=(22*r*r)/7;
		  
	  }
	}
	public class AreaCalculation extends AreaCal
	{

		public static void main(String[] args) 
		{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius of circle : ");
	double radius=sc.nextDouble();
	AreaCalculation Areasobj=new AreaCalculation();
	Areasobj.Areacircles(radius);
	System.out.println(Areasobj.area);
	sc.close();
		}
	}
	
	

	


	
	


