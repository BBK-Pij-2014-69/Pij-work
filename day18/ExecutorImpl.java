package day18;

import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {
	TaskManager manager;

	public ExecutorImpl(){
		this.manager = new TaskManager();
		Thread t = new Thread(manager);
		t.start();
	}
	
	@Override
	public void execute(Runnable command) {
		this.manager.add(command);
	}
	
}
