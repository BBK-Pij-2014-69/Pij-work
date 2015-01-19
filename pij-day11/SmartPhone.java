public class SmartPhone extends MobilePhone{

	public SmartPhone(String brand){
			super(brand);
	}

	@Override
	public void call(String number){

		if (number.substring(0,2).equals("00")){
			System.out.println("Calling " + number + " through the internet to save money");
		}
	}


	public void browseWeb(String address){
		System.out.println(address);
	}



	public void findPosition(){
		System.out.println("Latitude: 51.527424 | Longitude: -0.127055");
	}
}