package Combinations;

import java.util.Scanner;

public class Permutations {

	public double fact(double n)
		{
		double nfact=1;
		int i=1;
		while(i<=n)
		{
			 nfact=nfact*i;
		i++;
		}
		return nfact;

	}
	
	
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value: ");
int n=sc.nextInt();
System.out.println("Enter r value: ");
int r=sc.nextInt();
Permutations obj=new Permutations();
System.out.println("=====No of Combinations====");
 double C=obj.fact(n)/(obj.fact(r)*obj.fact(n-r));
 System.out.println("nCr = "+C);
 System.out.println("=====No of Permutations====");
 double P=obj.fact(n)/obj.fact(n-r);
 System.out.println("nPr = "+P);
	}

}
