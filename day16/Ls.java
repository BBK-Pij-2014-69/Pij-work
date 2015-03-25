package day16;

import java.io.*;
import java.util.Arrays;


public class Ls {

	public static void main(String[] args) {
		File myFile = new File(".");
		System.out.println(Arrays.toString(myFile.list()));
	}

}
