package day18;

import java.util.concurrent.*;


public class TextLoopReEx implements Runnable { 
	
	public static final int COUNT = 10;
	
	private final String name;

	public TextLoopReEx(String name) { 
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		} 
	}

	public static void main(String args[]) {
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>"); 
			System.out.println(" mode 0: without threads"); 
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++){
				Runnable r = new TextLoopReEx("Thread " + i);
				r.run();
			}
		} else {
			for (int i = 0; i < 10; i++){
				Executor executor = new ExecutorImpl();
				Runnable r = new TextLoopReEx("Thread " + i);
				executor.execute(r);
			}
		}
	}
	
}
