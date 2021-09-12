package Pattern;

public class Bpattern {
	public static void main(String[] args) {
		for(int i=1;i<=13;i++)
		{
			for(int j=1;j<=17;j++)
			{
				if(i==1 || i==13|| j==17 || i==7 || j==1)
				{
					System.out.print("*");
				}
				else if(i==1 &&  j==1)
				{
					System.out.print(" ");
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}

}
