package fundamentals;

import java.util.Scanner;

public class AddTwoNumber {

	public  int addTwoNumbers(int i,int j)
	{
		return i+j;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumber obj =new AddTwoNumber();
		Scanner sc=new Scanner(System.in);
System.out.println("enter a: ");
int a=sc.nextInt();
System.out.println("enter b: ");
int b=sc.nextInt();
System.out.println("C= "+obj.addTwoNumbers(a,b));
	}

}
