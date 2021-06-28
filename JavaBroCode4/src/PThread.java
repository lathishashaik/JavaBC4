
public class PThread extends Thread{
	public void run() {
	/*	try {
			Thread.sleep(10000);
			System.out.println("Thread is running");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		if(this.isDaemon()) {
			System.out.println("Daemon thread is running");
		}
		else {
			System.out.println("User thread is running");
		}
		
	}

}
