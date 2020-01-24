import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("enter the no of rows ");
			Scanner sc1=new Scanner(System.in);
			int	n=sc1.nextInt();
			
			int spaces=n-1;
			
			int stars=1;
			
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<spaces;j++)
				{
					System.out.println(" ");
					
				}
				spaces--;
				
				for(int k=0;k<stars;k++)
				{
					System.out.println("*");
				}
				stars=stars+2;
			}
			
			System.out.println("\n");
			
			
		}
	}


