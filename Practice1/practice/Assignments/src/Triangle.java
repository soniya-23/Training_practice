import java.util.Scanner;

public class Triangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
        System.out.println("enter the no of rows ");
		Scanner sc1=new Scanner(System.in);
		int	n=sc1.nextInt();
		
		int spaces=n-1;
		
		int stars=1;
		
		for(int i=0;i<n;i++)//no of times loop repeated.
		{
			
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");//to print spaces
				
			}
			spaces--;
			
			for(int k=0;k<stars;k++)
			{
				System.out.print("*");
			}
			stars=stars+2;     //to print stars.
		
		
			System.out.println("\n");
		
		}
		
	}
	

}
