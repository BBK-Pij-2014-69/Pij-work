public class Calculator{

	public int add (int x, int y){
		int c = x + y;
		System.out.println(c);
		return c;
	}

	public int subtract (int x, int y){
		int c = x - y;
		System.out.println(c);
		return c;
	}

	public int multiply (int x, int y){
		int c = x * y;
		System.out.println(c);
		return c;
	}

	public double divide (int x, int y){
		double a = (double) x;
		double b = (double) y;
		double c = a / b;
		System.out.println(c);
		return c;
	}

	public int modulus (int x, int y){
		int c = x % y;
		System.out.println(c);
		return c;
	}
}