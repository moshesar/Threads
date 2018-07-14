package threads;

public class MyTask {
	
	long x;
	volatile boolean stop;
	
	public MyTask() {
		stop=false;
		x=0;
	}
	
	public void doTask(){ // using anonymous class
		while(!stop)
			x++;
	}
		
	
	public void stopTask(){
		stop=true;
	}
	
	long getX(){ return x;}
	
}
