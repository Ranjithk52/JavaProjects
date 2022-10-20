package fundamentals;

import java.util.*;



public class Add {

	int c;//instace variable
	static int z=30;
	public static void main(String[] args) {
   Add obj=new Add();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
			int a=sc.nextInt();//local variable
			System.out.println("Enter 2nd number: ");
			int b=sc.nextInt();
		obj.c=a+b;
			System.out.println("Sum of number is: "+obj.c+" "+z);
			sc.close();
			

	}
	

}
