package constructor;

 class Parent{
	Parent(){
		this(10);
		System.out.println("From Parent class");
	}
	Parent(int x){
		System.out.println("from parent parameter constructor");
	}
}
public class ConstructorDemo extends Parent {
	ConstructorDemo(){
	this(10);
		System.out.println("From child class");
	}
    ConstructorDemo(int x){
    	this(10,20);
    	System.out.println("from child parameter constructor");
	}
    ConstructorDemo(int x,int y){
    	this(10,20,30);
    	System.out.println("from chid 2 parameter constructor");
	}
    ConstructorDemo(int x,int y,int z){
    
    	System.out.println("from child 3 parameter constructor");
	}
	public static void main(String[] args) {
ConstructorDemo obj=new ConstructorDemo();
	}

}
