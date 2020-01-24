package collections;
import java.util.*;


	public class Comparableex implements Comparable<Comparableex> {

		int rno;
		String name;
		int age;

		Comparableex(int rno,String name,int age )	
		{
			this.rno=rno;
			
			this.name=name;
			
			this.age=age;	
		}
		
		public int compareTo(Comparableex a)
		{
			if(age==a.age)
			
				return 0;
			
			if(age>a.age)
			
				return 1;
			
			return -1;
			
			
			
		}
		
		
			
		@Override
		public String toString() {
			return " rno=" + rno + ", name=" + name + ", age=" + age + " ";
		}

		public static <E> void main(String[] args) {
			// TODO Auto-generated method stub
			 
			ArrayList<Comparableex> list1= new ArrayList<Comparableex>();
			
			list1.add(new Comparableex(1,"soniya",21));
			
			list1.add(new Comparableex(2,"raji",20));
			
			list1.add(new Comparableex(3,"ramana",22));
			
			list1.add(new Comparableex(4,"madhesh",22));
			
			list1.add(new Comparableex(5,"jani",21));
			
			Collections.sort(list1);
			
//			Iterator<Comparableex> itr=list1.iterator();
			
			for(Comparableex a:list1)
			{
				System.out.println(a);
				
			}
			
			
			
			
			
			
		}

	}

	
	

