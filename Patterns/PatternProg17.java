package Patterns;

public class PatternProg17 {

	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=5;++i)
		{
			
			for(int j=1;j<=5;++j)
			{
				
				System.out.print(2*(i+j)-3+" ");
				++k;
			}
			System.out.println();
		}
	}

}
