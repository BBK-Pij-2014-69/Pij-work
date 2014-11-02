import java.util.Scanner;
public class power
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
int base = Integer.parseInt(System.console().readLine());
int exponent = Integer.parseInt(System.console().readLine());
int r = pow(base,exponent);
System.out.println (r);
} private static int pow(int base,int exponent){
	if (exponent == 1){
		return base;
	}else{
		return base * pow(base,exponent-1);
	}
}
}

