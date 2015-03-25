package day16;

import java.io.*;

public class Cat {

	public static void main(String[] args) {
		File myFile = new File("./kierensmkdir" + File.separator + args[0]);
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(myFile));
			String line;
			while((line = in.readLine()) != null){
				System.out.println(line);
			}
		}catch (FileNotFoundException ex) { 
			System.out.println("File " + myFile + " does not exist");
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (in !=null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
