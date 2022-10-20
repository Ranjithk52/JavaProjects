package Combinations;
import java.util.Scanner;
public class PermutationsAndCombinations {
	public static void main(String[] args) 
		{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	System.out.println("Enter r value");
	int r=sc.nextInt();
	System.out.println("=====No of Combinations====");
	int nfact=1,rfact=1,n_rfact=1;
	for(int i=1;i<=n;++i)
	{
		nfact*=i;
		
	}
	for(int i=1;i<=r;++i)
	{
		rfact*=i;
		
	}
	for(int i=1;i<=n-r;++i)
	{
		n_rfact*=i;
		
	}

	int C=nfact/(rfact*n_rfact);
	System.out.println("nCr = "+C);
	System.out.println("=====No of Permutations====");
	int P=nfact/n_rfact;
	System.out.println("nPr = "+P);
		}

	}


	
