package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Deque<String> dq=new ArrayDeque<String>(); 
	ArrayDeque<Integer> dq1=new ArrayDeque<Integer>();
	dq.add("soniya");
	dq.add("raji");
	dq1.add(1);
	dq1.add(2);
	dq1.remove(1);
	Iterator<String> itr1=dq.iterator();
	
	while(itr1.hasNext())
	{
		
		System.out.println(itr1.next());
	}
	
	
	Iterator<Integer> itr2=dq1.iterator();
		
	while(itr2.hasNext())
	{
		
		System.out.println(itr2.next());
	}	
		
	
	}

}
