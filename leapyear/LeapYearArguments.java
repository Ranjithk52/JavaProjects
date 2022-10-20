package leapyear;

public class LeapYearArguments 
{

	public static void main(String[] args) 
	{
     int year=Integer.parseInt(args[0]);
     if(year!=0)
     {
     if(year%400==0)
     {
    	 System.out.println(year+" is Leap Year");
     }
     else if(year%100==0)
     {
    	 System.out.println(year+" is not a Leap Year");
     }
     else if(year%4==0)
     {
    	 System.out.println(year+" is a Leap Year");
     }
     else
     {
     System.out.println(year+" is not a leap year");
	}
     }
}
}
