
public class PRunner {

	public static void main(String[] args) {
		PThread t1=new PThread();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		//Similarly can set priority(range 1-10)(Higher number =>higher priority)
		
		
	/*	System.out.println(t1.isAlive());//Before t1.start() false
		t1.start();
		System.out.println(t1.isAlive());//After t1.start() true*/
		
		System.out.println(t1.isDaemon());
//We can make thread daemon BUT we need to make sure that start() is not called before
	
		t1.setDaemon(true);
		t1.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread - t1");
		System.out.println(Thread.currentThread().getName());
	
	}

}
