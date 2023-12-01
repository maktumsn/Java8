
public class MultiThreading extends Thread {

	
	public void run()
	{
		System.out.println("thread started");
	}
	public static void main(String[] args) {
		MultiThreading Thread_a = new MultiThreading();
		MultiThreading Thread_b = new MultiThreading();
		MultiThreading Thread_c = new MultiThreading();
		
		Thread_a.start();
		Thread_b.start();
		Thread_c.start();
	}
}
