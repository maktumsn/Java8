
public class MutliThread2 implements Runnable{
	
	int Threadnum;
	
	
	
	public MutliThread2(int threadnum) {
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
			MutliThread2 t1 = new MutliThread2(i);
			Thread tr = new Thread(t1);
					tr.start();
			
//			try {
//				t1.join();  // to wait for one thread to finish 
//			} catch (InterruptedException e) {
//			
//			}
		}

		
	
	}

}
