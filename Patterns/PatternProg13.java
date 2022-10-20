package Patterns;

public class PatternProg13 {

	public static void main(String[] args) {
		for(int i=1;i<=5;++i)
		{
			int k=i;
			int y=5-i+1;
			for(int j=1;j<=5;++j)
			{
				if(j%2==1)
				{
					System.out.print(k+" ");
				}
				else
				{
					System.out.print(y+" ");
				}
				k+=5;
				y+=5;
			}
			System.out.println();
		}
	}

}
