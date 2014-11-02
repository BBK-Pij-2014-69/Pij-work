import java.util.Scanner;
public class Hanoi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
long n = Integer.parseInt(System.console().readLine());
long r = hanoiDiscs(n);
System.out.println (r);
} private static long hanoiDiscs(long n){
	if (n == 1){
		return 1;
	}else{
		 long result = (((hanoiDiscs(n-1)*2)+1));
		 return result;
	 }
 }
}

