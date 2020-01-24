import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);
		list.add(4);list.add(5);
		
		List<Integer> l1=new ArrayList<Integer>();
		
		l1=list.stream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
		System.out.println(l1);
				
				
				
			//	.count(i ->i.list)
			
		
		
		
	}

}
