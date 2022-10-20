package fundamentals;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range: ");
       int a=sc.nextInt();
       int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			 int cnt=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
				
			}
			if(cnt==1)
			{
				System.out.println(i);
			}
			
		}
		
		
	}

}
