import java.util.Scanner;
public class youSaidHigh
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
String sequence = ("");
System.out.print ("please enter a number (end with -1): ");
String str = System.console().readLine();
int a = Integer.parseInt(str);
System.out.print ("and another: ");
String strs = System.console().readLine();
int b = Integer.parseInt(strs);
if ((a != b-1) || (a != b+1)) {
	sequence = ("No");
}
if (b > a) {
	while (a != -1) {
		System.out.print ("and another: ");
		strs = System.console().readLine();
		b = Integer.parseInt(strs);
		if (b == -1) {
			a = b-1;
		}
		if (a != b-1) {
			sequence = ("No");
		}
		a = b;
	}
} else {
	while (a != +1) {
		System.out.print ("and another: ");
		strs = System.console().readLine();
		b = Integer.parseInt(strs);
		if (b == -1) {
			a = b+1;
		}
		if (a != b-1) {
			sequence = ("No");
		}
		a = b;
}
if (sequence.length() < 2) {
	sequence = ("Yes");
}
}
System.out.println (sequence);
}}

