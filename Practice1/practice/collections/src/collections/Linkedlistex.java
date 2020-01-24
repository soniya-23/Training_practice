package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<Integer>	li=new LinkedList<Integer>();
	
	for(int i=0;i<=10;i++)
	{
		li.add(i);
		
			
	}
	li.remove();
	Iterator itr=li.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	//itr.remove();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	}
	

}
