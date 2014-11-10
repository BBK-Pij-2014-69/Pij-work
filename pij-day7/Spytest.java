import java.util.Scanner;
public class Spytest
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Spy spy1= new Spy(123);
Spy spy2= new Spy(234);
Spy spy3= new Spy(345);
Spy spy4= new Spy(456);
spy3.die();
Spy spy5= new Spy(567);
Spy spy6= new Spy(678);
Spy spy7= new Spy(789);
spy7.die();
}}

