
public class MutliThread1 extends Thread{
	
	int Threadnum;
	
	
	
	public MutliThread1(int threadnum) {
		super();
		Threadnum = threadnum;
	}

	@Override
	public void run()
	{
		
		for(int i=0;i<5;i++) {
		System.out.println(i+" form thread "+ Threadnum);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		}
	}
	
	public static void main(String[] args) {
		
		
		for (int i=0;i<5;i++)
		{
			MutliThread1 t1 = new MutliThread1(i);
			t1.start();
			
//			try {
//				t1.join();  // to wait for one thread to finish 
//			} catch (InterruptedException e) {
//			
//			}
		}

		
	
	}

}
