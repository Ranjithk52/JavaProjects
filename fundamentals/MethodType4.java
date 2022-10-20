package fundamentals;

public class MethodType4 {
public synchronized void m4()
{
	System.out.println("From Synchronized Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodType4 obj=new MethodType4();
obj.m4();
	}

}
