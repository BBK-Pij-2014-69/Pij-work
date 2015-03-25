package day19;

import java.util.Arrays;
import java.util.List;

public class Towns {

	
	public static void main(String[] args){
		
		List<String> towns = Arrays.asList("Chelmsford","Canterbury","Oxford", "Cambridge", "Norwich", "Exeter");
		
//		for (String s: towns){
//			System.out.println(s);
//		}
		
//		Consumer c = new MyConsumer();
//		towns.forEach(c);
		
//		towns.forEach(s -> System.out.println(s));
		towns.forEach(System.out::println);
		
	}
}

//class MyConsumer implements Consumer{
//
//	@Override
//	public void accept(Object t) {
//		System.out.println(t);
//	}
//	
//}