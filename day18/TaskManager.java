package day18;

import java.util.LinkedList;
import java.util.List;

public class TaskManager implements Runnable {
	List<Runnable> tasks;
	
	public TaskManager(){
		this.tasks = new LinkedList<Runnable>();
	}
	
	public synchronized void add(Runnable command){
		this.tasks.add(command);
		notifyAll();
	}
	
	@Override
	public void run() {
		Runnable next = tasks.remove(tasks.size() - 1);
		next.run();
	}

}
