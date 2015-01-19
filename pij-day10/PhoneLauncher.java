public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone iphone = new SmartPhone("IPhone");
		iphone.call("007999418756");
		iphone.ringAlarm("07:30");
		iphone.playGame("Angry Birds");
		iphone.printLastNumbers();
		iphone.browseWeb("www.google.co.uk");
		iphone.findPosition();
		System.out.println (iphone.getBrand());
	}
}