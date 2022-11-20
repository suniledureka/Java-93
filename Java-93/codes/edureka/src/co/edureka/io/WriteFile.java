package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true); //true - appending mode
		
		String str = "World's #1 E-Learning Platform. Edureka's online training helps you land your dream job.\n";
		byte[] data = str.getBytes(); //to convert String to byte[]
		
		fout.write(data);
		
		System.out.println("file saved!!");
		fout.close();
	}
}
