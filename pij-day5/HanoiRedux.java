import java.util.Scanner;
public class HanoiRedux
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
long n = Integer.parseInt(System.console().readLine());
long r = hanoiDiscs(n);
System.out.println (r);
} private static long hanoiDiscs(long n){
	if (n <= 1){
		return 1;
	}else if (n%3==0){
		long result = (2 * hanoiDiscs(n-1) - 1);
		return result;
	}else{
		 long result = (2 * hanoiDiscs(n-1) + 1);
		 return result;
	 }
 }
}

