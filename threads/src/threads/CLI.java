package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLI {
	
	public void start() throws IOException{
	MyTask t=new MyTask();
	System.out.println("1. start task");
	System.out.println("2. get X");
	System.out.println("3. stop task");
	System.out.println("4. exit");
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	int input=0;
	
	while(input!=4){
		input=Integer.parseInt(in.readLine());	
		switch(input){
		 case 1: t.doTask();break;
		 case 2: System.out.println(t.getX());break;
		 case 3: t.stopTask();break;
		 }
		}
	}
}

