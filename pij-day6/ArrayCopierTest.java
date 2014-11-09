import java.util.Scanner;
public class ArrayCopierTest
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
ArrayCopier test = new ArrayCopier();
int[] src = {1, 2, 3};
int[] dst = {0, 0, 0, 0};
test.copy(src,dst);
for (int i = 0; i < dst.length; i++){
	System.out.print (dst[i] + " ");
}
}}

