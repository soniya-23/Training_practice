package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PriorityQueue<String>	queue=new PriorityQueue<String>();
	
	queue.add("soniya");
	queue.add("raji");
	queue.add("ramana");
	queue.add("madhesh");
	queue.add("jani");
	queue.add("intralinks");
	
	/* element() & peek() are used to print the 1st elements 
	 * when queue is empty element() throws an exception and peek returns null value
	 */
	System.out.println("head :"+queue.element());
	
	System.out.println("head is :"+queue.peek());
	
	
	Iterator itr=queue.iterator();
	
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
	}
	
		queue.remove();			//remove and poll methods to remove the 1st element of the queue
		queue.poll();
		
		System.out.println("after deletion");
		
		Iterator itr1=queue.iterator();
		
		while(itr1.hasNext())
		{
			
			System.out.println(itr1.next());
		}
		
		
		
	}

}
