package collections;

import java.util.Iterator;
import java.util.Stack;

public class Stackex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<String> st=new Stack<String>();
	
	st.push("soniya");
	st.push("raji");
	st.push("syama veera venkata ramana surishetti");
	st.pop();
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	//System.out.println(st);	
	
	
	}

}
