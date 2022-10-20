package AccessSpecifiers;

public class MethodTypes {

	public void sayHello(String name) 
	{
		System.out.println("Welcome Mr." + name);
	}
public static void m1()
{
	System.out.println("From Static Method");
}
 public final int m2()
{
	return 10;
	//System.out.println("From Final Method");

}
 
 
	public static void main(String[] args) 
	{
		MethodTypes obj = new MethodTypes();
		obj.sayHello("Ranjith");
		m1();
		System.out.println(obj.m2());
	
	}

}
