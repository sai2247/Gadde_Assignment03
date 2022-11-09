package Question9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Question9 { 
	public static void main(String[] args) {
//		In Question21, we wrote below lines to write data to files
		
		/*
		FileOutputStream fileOutputStream = new FileOutputStream("q21.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(movie);
		outputStream.writeObject(movie1);
		outputStream.close();
		fileOutputStream.close();
		*/
		
//		Same lines can be write like below by using try with resource
		
		// we dont need to bother about closing the resources
		try(FileOutputStream fileOutputStream = new FileOutputStream("q21.txt");
				ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);) {
			outputStream.writeObject("");
			outputStream.writeObject("");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	
	
}