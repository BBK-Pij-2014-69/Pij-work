public class ComparatorTest{

	public static void main(String[] args){
		ComparatorTest test = new ComparatorTest();
		test.launch();
	}

	public void launch(){
		Comparator test = new Comparator();
		int a = 1;
		int b = 2;
		double c = 3.0;
		double d = 4.0;
		String e = "5";
		String f = "6";
		System.out.println(test.getMax(a,b));
		System.out.println(test.getMax(c,d));
		System.out.println(test.getMax(e,f));
	}
}