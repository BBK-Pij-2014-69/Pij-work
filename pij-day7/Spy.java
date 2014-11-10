public class Spy{
	private static int spyCount = 0;
	public int spyId;
	
	public Spy(int id){
		spyId = id;
		spyCount++;
		System.out.println ("SpyID: " + spyId + " The total number of spies is: " + spyCount);
	}
	
	public void die(){
		spyCount--;
		System.out.println ("Spy " + spyId + " has been detected and eliminated");
		System.out.println ("The remaining number of spies is " + spyCount);
	}
}