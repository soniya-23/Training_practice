package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("sony");  
		set.add("raji");  
		set.add("sony");  
		set.add("abc");  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	}


