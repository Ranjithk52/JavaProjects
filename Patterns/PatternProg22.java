package Patterns;

public class PatternProg22 {

	public static void main(String[] args) {
		System.out.println("-----with conditions----");
		for(int i=1;i<=5;++i)
		{
			for(int j=1;j<=5;++j)
			{
				if(i%2==1)
				{
					System.out.print("0"+" ");
				}
				else
				{
					System.out.print("1"+" ");
				}
												
			
			}
			System.out.println();
	}
		
		System.out.println("-----without conditions-------");
		for(int i=0;i<5;++i)
		{
			for(int j=1;j<=5;++j)
			{
								System.out.print(i%2+" ");
				
			
			}
			System.out.println();
	}
	}

}
