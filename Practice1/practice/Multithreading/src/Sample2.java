


	
	public class Sample2 implements Runnable {

		
		public void run() {
			System.out.println("thread created");
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			Sample1 t1=new Sample1();
			t1.start();
			Sample1 t2=new Sample1();
			t2.start();
			
				
		}
		
		
	}



