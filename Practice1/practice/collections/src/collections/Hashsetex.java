package collections;

import java.util.HashSet;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Hashsetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet<String> set=new HashSet<String>();  
		set.add("sony");  
		set.add("raji");  
		set.add("mady");  
		set.add("sony");  
		set.remove("sony");
		//Traversing elements  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
