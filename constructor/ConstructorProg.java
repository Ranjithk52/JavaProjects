package constructor;

class  Students
{
	String name;
	int id;
	String course;
	double percentage;
	

	public Students(String name, int iD, String course, double percentage) {
		
		this.name = name;
		this.id = iD;
		this.course = course;
		this.percentage = percentage;
	}
	
	public void StudentsInfo()
	{
		System.out.println("Name= "+this.name);
		System.out.println("id= "+this.id);
		System.out.println("course= "+this.course);
		System.out.println("percentage= "+this.percentage);
		System.out.println("===================");

		
	}
}


public class ConstructorProg 
{

	public static void main(String[] args) 
	{
Students s1;
s1=new Students("ranjith",22032,"java",66);
s1.StudentsInfo();

s1=new Students("bhagya",22033,"java",67);
s1.StudentsInfo();
	}

}
