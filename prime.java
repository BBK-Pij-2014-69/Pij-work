import java.util.Scanner;
public class prime
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.print ("Please enter a number: ");
String str = System.console().readLine();
int i = Integer.parseInt(str);
int n = i;
boolean finished = false;
while (!finished){
	if (n > 2) {
		n = (n - 1);
		if ((i % n) == 0) {
			System.out.println (i + (" is not a prime Number"));
			finished = true;
		}
	} else {
		System.out.println (i + " is a prime number");
		finished = true;
	}
}
	
}}

