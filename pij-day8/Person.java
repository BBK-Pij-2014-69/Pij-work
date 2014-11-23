public class Person{
	private String name;
	private Person next;
	
	public Person(String txt){
		name = txt;
		next = null;
	}
	
	public String getName(){
		return name;
	}
	
	public void setNext(Person person){
		next = person;		
	}
	
	public Person getNext(){
		return next;		
	}
}