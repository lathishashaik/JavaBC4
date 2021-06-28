
public class QRunner {

	public static void main(String[] args) {
		//2 ways of creating thread
	
		//1st way
//create class & make sure it extends Thread class & have access to run() 
		QMultithreading t1=new QMultithreading();
	
		//2nd way
//create class that implements Runnable interface & take this instance & pass it as 
//argument of Thread class
		QMyRunnable r1=new QMyRunnable();
		Thread t2=new Thread(r1);
		
	/*	t1.start();
		t2.start();
//***Threads are indep,they don't affect execution of other threads(User threads only)
		System.out.println(1/0);//t1,t2 execution continues*/
		
		//But if we make t1,t2 as daemon threads then
		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println(1/0);//Exception raises & prog terminates
	}
	

}
