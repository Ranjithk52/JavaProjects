package AccessSpecifiers;

public class P1 {
	public int a=10;//it will access in other class and also another package(import package.class name) 
	public static int b=20;//it will access directly in same class but in another class you can access with classname.variable
	private int c=30;//with in the class it will access 
	protected int e=40;//can access protected variable with in package directly with obj,in other package we shud extend the parent class and creat object with sub class
	int f=50;//
	static int g=60;
			boolean i;
	public static void main(String[] args) {
		P1 obj=new P1();
		int d=obj.c;
       // System.out.println(d);
       // System.out.println(obj.e);
       // System.out.println(obj.f);
       // System.out.println(g);
System.out.println(obj.i);
	}

}
