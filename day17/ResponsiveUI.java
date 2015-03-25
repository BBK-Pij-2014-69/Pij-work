package day17;


import java.util.LinkedList;


public class ResponsiveUI{
	public LinkedList<Integer> list;
	

	public static void main(String[] args) {
			ResponsiveUI newUI = new ResponsiveUI();
			newUI.launch();
	}
		
	public void launch(){
		list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++){
			System.out.print("Enter the duration (in ms) of task " + i +":");
			int time = Integer.parseInt(System.console().readLine());
			Task newTask = new Task(time, i, list);
			Thread newThread = new Thread(newTask);
			newThread.start();
			while (!list.isEmpty()){
				String finishedThreads = "Finished Tasks: ";
				while (!list.isEmpty()){
					finishedThreads = finishedThreads  + list.removeFirst() + ", ";
				}
				System.out.println(finishedThreads);
			}
		}
	}

}
