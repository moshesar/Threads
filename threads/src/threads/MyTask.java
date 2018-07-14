package threads;

public class MyTask {
	
	long x;
	volatile boolean stop;
	
	public MyTask() {
		stop=false;
		x=0;
	}
	
	public void doTask(){ // using anonymous class
		new Thread(new Runnable() {
		@Override
		public void run() {
			while(!stop){
				x++;
				}
			}
		}
		).start();
	}
		
	
	public void stopTask(){
		stop=true;
	}
	
	long getX(){ return x;}
	
}
