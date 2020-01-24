import java.util.Scanner;

public class Rhombhus implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("enter the no of rows ");
			Scanner sc1=new Scanner(System.in);
			int	n=sc1.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				for(int j=n-i;j>=1;j--)
					
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i)-1;k++)
				{
					System.out.print("*");
				}
				System.out.println("\n");
			}
			
			
			for(int i=n-1;i>=1;i--)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=(2*i)-1;k++)
				{
					System.out.print("*");
				}
				System.out.println("\n");
			}
	}
}
