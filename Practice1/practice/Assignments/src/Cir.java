
public class Cir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1=7;
		int n2=5;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if((j==0||j==4)&&(i!=0 && i!=6)||(i==0||i==6)&&(j>0&&j<4))
				{
					System.out.print("*");
				}
				System.out.print("  ");
			}
			System.out.println("\n");
		}
		
	}

}
