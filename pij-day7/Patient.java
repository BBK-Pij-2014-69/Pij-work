public class Patient{
	public String name;
	public int age;
	public String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient){
		if (this.nextPatient == null){
			this.nextPatient = newPatient;
		}else{
			this.nextPatient.addPatient(newPatient);
		}
	}

	public boolean deletePatient(Patient patient){
		if (this.nextPatient == null){
			return false;
		}else if (this.nextPatient.name.equals(patient.name)){
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}else{
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public boolean print(Patient patient){
		if (this.nextPatient == null){
			System.out.println (this.name + " " + this.age + " " + this.illness);
			return false;
		}else{
			System.out.println (this.name + " " + this.age + " " + this.illness);
			return this.nextPatient.print(patient);
		}
	}
}