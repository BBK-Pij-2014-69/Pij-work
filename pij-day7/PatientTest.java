public class PatientTest{
	private Patient patientListStart = null;

	public static void main(String[] args){
		PatientTest test = new PatientTest();
		test.launch();
	}

	public void launch(){
		Patient firstPatient = new Patient("John", 33, "TB");
		patientListStart = firstPatient;
		Patient seconedPatient = new Patient("Mike", 34, "Myeloma");
		patientListStart.addPatient(seconedPatient);
		Patient thirdPatient = new Patient("dave", 35, "Aml");
		patientListStart.addPatient(thirdPatient);
		Patient fourthPatient = new Patient("Jane", 36, "Sepsis");
		patientListStart.addPatient(fourthPatient);
		Patient fifthPatient = new Patient("Mary", 37, "Daibetic");
		patientListStart.addPatient(fifthPatient);
		patientListStart.print(patientListStart);
	}
}