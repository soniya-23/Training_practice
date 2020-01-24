
public class JoinMethod extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(i);
		}	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JoinMethod m1=new JoinMethod();
    JoinMethod m2=new JoinMethod();
    JoinMethod m3=new JoinMethod();
    m1.start();
    try {
    	m1.join();
    }
    catch(Exception e){
    	System.out.println(e);
    }
		m2.start();
		m3.start();
		
	}

}
