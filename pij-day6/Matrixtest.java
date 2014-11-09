import java.util.Scanner;
public class Matrixtest
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Matrix test = new Matrix(5,5);
String str = ("1,2,3,4,5");
test.setColumn(0,str);
test.setRow(0,str);
test.setElement(4,4,2);
test.prettyPrint();
test.tostring();

}}

