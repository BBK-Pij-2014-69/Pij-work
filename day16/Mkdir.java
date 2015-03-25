package day16;

import java.io.*;

public class Mkdir {

	public static void main(String[] args) {
		File myFile = new File("./" + args[0]);
		myFile.mkdir();
	}

}
