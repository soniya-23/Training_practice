import java.util.*;

public class Comparableex implements comparable<Comparableex> {

	

	Comparableex(int rno,String name,int age )	
	{
		this.rno=rno;
		
		this.name=name;
		
		this.age=age	
	}
	
	public void compareTo(Comparableex x)
	{
		if(x.age==age)
		
			return 0;
		
		if(x.age>age)
		
			return 1;
		
		return -1;
		
		
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Comparableex> list= new ArrayList<Comparableex>();
		
		list.add(1,"soniya",21);
		
		list.add(2,"raji",20);
		
		list.add(3,"ramana",22);
		
		list.add(4,"madhesh",22);
		
		list.add(5,"jani",21);
		
		Collections.sort(s, new(Comparableex));
		
		Iterator<Comparableex> itr=s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
	}

}
