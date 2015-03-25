package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functional {

	public static void main(String[] args) {
		
		final List<String> towns = Arrays.asList("Chelmsford","Canterbury","Oxford", "Cambridge", "Norwich", "Exeter");
		
		List<String> uc = new ArrayList<>();
//		for(String s: towns){
//			uc.add(s.toUpperCase());
//		}
//		
//		towns.forEach(town -> uc.add(town.toUpperCase()));
		
		//towns.forEach(town -> uc.add(town.startsWith("C")));
		
		System.out.println(towns);
		System.out.println(uc);
	}

}
