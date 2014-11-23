public class HashUtilitiesTest{
	public static void main(String[] args){
		String str = "";
		while (!str.equals("q")){
			System.out.println ("Give me a string and I will calculate its hash code");
			str = System.console().readLine();
			int hash = str.hashCode();
			int smallHash = HashUtilities.shortHash(hash);
			System.out.println("0 < " + smallHash + " < 1000");
		}
	}
}