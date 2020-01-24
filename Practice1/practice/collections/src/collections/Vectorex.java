package collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v=new Vector<String>();
		
		v.add("soniya");
		v.add("soniya");
		v.add("raji");
		v.remove(1);
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
