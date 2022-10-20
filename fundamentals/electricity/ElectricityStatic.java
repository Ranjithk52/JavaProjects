package electricity;

import java.util.Scanner;

public class ElectricityStatic {

	public static void main(String[] args) 
	{
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the units: ");
      double units=sc.nextDouble();
      double amount=0;
      if(units<100)
      {
    	  amount=units*1.2;
    	  System.out.println(amount);
      }
      else if(units<300)
      {
    	  amount=100*1.2+(units-100)*2;
    	  System.out.println(amount);
      }
      else if(units>300)
      {
    	  amount=100*1.2+200*2+(units-300)*3;
    	  System.out.println(amount);
      }
	}

}
