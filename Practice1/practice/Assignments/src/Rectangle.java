import java.util.*;
public class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
        System.out.println("enter length");
			Scanner sc1=new Scanner(System.in);
			int	length=sc1.nextInt();
			 System.out.println("enter width");
			Scanner sc2=new Scanner(System.in);
			int	width=sc2.nextInt();
				
				for(int i=0;i<length;i++)
				{
					for(int j=0;j<width;j++)
					{
						System.out.print("*");
					}
					System.out.println(" ");
				}
		}
				
		
		
}


