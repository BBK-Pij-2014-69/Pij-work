public class Supermarket implements PersonQueue{
	private Person head;
	
	public Supermarket(){
		head = null;
	}
	
	public void addPerson(Person person){
		insert(person);
	}
	
	public void insert(Person person){
		if (head != null){
			head.setNext(person);
		}
		head = person;
	}
	
	public void servePerson(){
		if (retrieve() != null){
			head = head.getNext();
		}
	}
		
	public Person retrieve(){
		if (head == null) {
			return null;
		}
		return head;
    }
}