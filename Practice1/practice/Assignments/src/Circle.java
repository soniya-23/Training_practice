import java.util.Scanner;

public class Circle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("enter length");
			Scanner sc1=new Scanner(System.in);
			
			int	a=sc1.nextInt();
			 System.out.println("enter width");
			Scanner sc2=new Scanner(System.in);
			int	b=sc2.nextInt();
		
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				if((j==0||j==4)&&(i!=0 && i!=6)||(i==0||i==6)&&(j>0&&j<4))
				{
					System.out.print("*");
				}
				
				
				System.out.print("   ");
			}
			System.out.println("\n");
		}
	}
	
}

