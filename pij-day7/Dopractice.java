import java.util.Scanner;
public class Dopractice
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int noOfStudent = 0;
int distin = 0;
int pass = 0;
int fail = 0;
int inval = 0;
int mark = 0;
do{
	System.out.print ("Input a mark: ");
	mark = Integer.parseInt(System.console().readLine());
	if (mark > 100){
		inval++;
	}else if (mark < -1){
		inval++;
	}else if (mark > 69){
		distin++;
		noOfStudent++;
	}else if (mark > 49){
		pass++;
		noOfStudent++;
	}else if (mark == -1){
		System.out.print ("There are " + noOfStudent + " Students: " + distin + " distinctions, ");
		System.out.println (pass + " passes, " + fail + " fails (plus " + inval + " invalid marks).");
	}else{
		fail++;
		noOfStudent++;
	}
} while(mark != -1);
}}

