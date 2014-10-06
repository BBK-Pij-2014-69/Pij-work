import java.util.Scanner;
public class maximising
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print ("please enter a number (end with -1): ");
String str = System.console().readLine();
int a = Integer.parseInt(str);
int highNum = a;
while (a > -1) {
	System.out.print ("and another: ");
	str = System.console().readLine();
	a = Integer.parseInt(str);
	if (a > highNum){
		highNum = a;
	}
}
System.out.println ("The highest number entered was: " + highNum);
}}

