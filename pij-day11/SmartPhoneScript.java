public class SmartPhoneScript {
	public static void main(String[] args) {
		SmartPhoneScript script = new SmartPhoneScript();
		script.launch();
	}

	public void launch() {
		MobilePhone myPhone = new SmartPhone("iphone");
		SmartPhone myNewSmartPhone = (SmartPhone) myPhone;
		myPhone.call("007999418756");
		myPhone.ringAlarm("07:30");
		myPhone.playGame("Angry Birds");
		myPhone.printLastNumbers();
		myNewSmartPhone.browseWeb("www.google.co.uk");
		myNewSmartPhone.findPosition();
		System.out.println (myPhone.getBrand());
		testPhone(myNewSmartPhone);
	}

	public void testPhone(Phone phoneTest){
		phoneTest.call("123456");
	}
}