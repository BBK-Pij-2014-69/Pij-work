package day14;

public class FibonacciTest {
	public static Fibonacci test = new Fibonacci();
	public static MemoizedFibonacci testtwo = new MemoizedFibonacci();

	public static void main(String[] args) {
		System.out.println(test.fib(40));
		System.out.println(testtwo.fib(3));
	}

}
