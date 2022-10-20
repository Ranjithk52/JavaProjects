package Areas;

import java.util.Scanner;

class Area
{
	double area;
  double Areacircle (double r)	
  {
	   
	  return (22*r*r)/7;
  }
}
public class CircleArea {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of circle : ");
int radius=sc.nextInt();
Area Areaobj=new Area();

System.out.println(Areaobj.Areacircle(radius));
sc.close();
	}

}
