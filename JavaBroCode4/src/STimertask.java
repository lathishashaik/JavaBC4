import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class STimertask {

	public static void main(String[] args) {
		Timer timer=new Timer();
		TimerTask task=new TimerTask() {
			int counter=10;
			@Override
			public void run() {
//TimerTask is linked to Timer..so when time's up it's gng to execute this 
				//run() of TimerTask instance
				
				
			//	System.out.println("Task is completed");
				
				//COUNT DOWN TIMER

				if(counter>0) {
					System.out.println(counter+" seconds");
					counter--;
				}
				else {
					System.out.println("!!!!!!!!!!!HAPPY NEW YEAR!!!!!!!!!!!");
					timer.cancel();//to stop the timer
				}
				
			}
		};
		
//linking is done by using schedule()
					//TimerTask obj,delay(in millisecs)
	//	timer.schedule(task, 3000);

		
		
/*the delay need not necessarily be a numeric value but can be date if 
we want task to be completed at a certain date in future
We can do this by utilizing Calendar class*/
		Calendar date=Calendar.getInstance();
			
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, Calendar.DECEMBER);
		date.set(Calendar.DAY_OF_MONTH,31);
		date.set(Calendar.HOUR_OF_DAY,23);
		date.set(Calendar.MINUTE,59);
		date.set(Calendar.SECOND,50);
		date.set(Calendar.MILLISECOND,0);
		
		//timer.schedule(task, date.getTime());
		
//TimerTask obj,time/delay of 1st instance or when you want this to be executed
		//,how often you want this(run()) repeated(/executed)
	//timer.scheduleAtFixedRate(task, 0, 1000);
		
		//10secs before NEWYEAR EVE
		//If we press run button & leave it executes at given time
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);

	}

}
