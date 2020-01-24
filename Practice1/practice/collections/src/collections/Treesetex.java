package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> set=new TreeSet<String>();  
		set.add("ramanas");  
		set.add("1234");
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//traversing elements  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
