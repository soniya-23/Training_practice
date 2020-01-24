import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList <String> list=new ArrayList<String>()	;
	list.add("soniya");
	list.add("madhesh");
	list.add("raji");
	list.add("ramana");
	list.add("jani");
	
	
	List<String> l1=new ArrayList<String>();
	
		System.out.println(l1);
	l1 = list.stream()
		.map(i->i.toUpperCase())
		.filter(j->j.startsWith("R"))
		.collect(Collectors.toList());
	System.out.println(l1);
		
	}

}
