
public class PriorityThread  extends Thread{

	public void run()
	{
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread pt1=new PriorityThread();
		PriorityThread pt2=new PriorityThread();
		PriorityThread pt3=new PriorityThread();
		pt1.start();
		pt2.start();
		pt1.setPriority(MAX_PRIORITY);
		pt2.setPriority(NORM_PRIORITY);
		pt3.setPriority(MIN_PRIORITY);
		System.out.println("thread1 priority is:"+pt1.getPriority());
		System.out.println("thread2 priority is:"+pt2.getPriority());
		System.out.println("thread3 priority is:"+pt3.getPriority());
	}

}
