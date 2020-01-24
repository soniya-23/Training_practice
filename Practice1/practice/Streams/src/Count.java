import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add( 1);list.add( 2);list.add(3);
		list.add(4);list.add( 5);
		
		//ArrayList<Long> l1=new ArrayList<Long>();
		
	   long	l1=list.stream()
				
				.count();
				
		System.out.println(l1);
				
				
				
				
			
	}

}
