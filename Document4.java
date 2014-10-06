import java.util.Scanner;
public class Document4
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
System.out.println ("Given a series of words, each on a separate line,");
System.out.println ("this program finds the length of the longest word.");
System.out.println ("Please enter several sentences, one per line. ");
System.out.println ("Finish with a blank line.");
int max = 0;
String str = ".";
while (str.length() > 0) {
str = System.console().readLine();
if (str.length() > max) {
max = str.length();
}
}
if (max == 0) {
System.out.println ("There were no words.");
} else {
System.out.println ("The longest sentence was " + max + " characters long.");
}
}}

