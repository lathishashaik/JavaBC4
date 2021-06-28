
public class QMultithreading extends Thread{
public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Thread #1 : "+i);
			try {
				Thread.sleep(1000);
//**********Threads are independent,they don't affect execution of other threads
				//System.out.println(1/0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 finished!");
	}

}
