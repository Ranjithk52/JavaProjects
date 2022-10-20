package electricity;

import java.util.Scanner;

class Electric
{
	double amount;
	void Electricity(double units)
	{
		
		if(units<=100) {
         amount=units*1.2;
           
		}
		else if(units<300)
		{
		amount=100*1.2+(units-100)*2;
		 
		}
		else if(units>300)
		{
			amount=100*1.2+200*2+(units-300)*3;
			 
		}
		
		
		
	}
}
public class ElectricityInheritance extends Electric
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter units");
     double unnits=sc.nextDouble();
     ElectricityInheritance obj=new ElectricityInheritance();
     obj.Electricity(unnits);
     System.out.println(obj.amount);
	}

}
