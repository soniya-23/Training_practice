import java.util.*;
public class Main_cls implements Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Rectangle"+"\n"+"2.Triangle"+"\n"+"3.Rhombhus"+"\n"+"4.circle"+"\n"+"enter your option");
	Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
	Rectangle r=new Rectangle();
	r.draw();
	break;
	case 2:
	Triangle t=new Triangle();
	t.draw();
	break;
	case 3:	
	Rhombhus rh=new Rhombhus();
	rh.draw();
	case 4:
		Circle c=new Circle();
		c.draw();
	break;
		default:
			System.out.println("invalid option");}
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
