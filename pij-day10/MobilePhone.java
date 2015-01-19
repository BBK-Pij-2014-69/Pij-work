public class MobilePhone extends OldPhone{

	public MobilePhone(String brand){
		super(brand);
	}

	public void ringAlarm(String time){
		System.out.println (time);
	}

	private void playGame(String gameName){
		System.out.println(gameName);
	}

	public void printLastNumbers(){
		System.out.println("07999418752");
		System.out.println("07999418753");
		System.out.println("07999418754");
		System.out.println("07999418755");
	}

}