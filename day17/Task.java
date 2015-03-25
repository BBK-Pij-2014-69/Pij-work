package day17;

import java.util.LinkedList;

public class Task implements Runnable {
	public int time;
	public int taskNumber;
	public LinkedList<Integer> list;
	
	public Task(int time, int taskNumber, LinkedList<Integer> list){
		this.time = time;
		this.taskNumber = taskNumber;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
		finally {
			this.list.add(this.taskNumber);
		}
	}

}
