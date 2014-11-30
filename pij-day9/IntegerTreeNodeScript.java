public class IntegerTreeNodeScript{
	public static void main(String[] args){
		IntegerTreeNode test = new IntegerTreeNode(6);
		test.add(9);
		test.add(5);
		test.add(3);
		test.add(8);
		test.add(11);
		test.add(12);
		System.out.println("Max Value: " + test.getMax());
		System.out.println("Min Value: " + test.getMin());
		if (test.contains(5) == true){
			System.out.println("found");
		}
		if (test.contains(20)==false){
			System.out.println("not found");
		}
		System.out.println(test);
		System.out.println(test.toSimpleString());
		System.out.println(test.depth());
		test.remove(8);
		System.out.println(test);
	}

}