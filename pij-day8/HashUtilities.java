public class HashUtilities{
	public static int shortHash(int hash){
		return Math.abs(hash%1000);
	}
}