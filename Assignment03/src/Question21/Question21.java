package Question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Question21 {
	// converting objects to byte stream is serialization
		// MOvieSer class should implement Serializable interface

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			MovieSer movie = new MovieSer("RRR", 2022);
			MovieSer movie1 = new MovieSer("Bahubali", 2019);
			FileOutputStream fileOutputStream = new FileOutputStream("q21.txt");
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(movie);
			outputStream.writeObject(movie1);
			outputStream.close();
			fileOutputStream.close();

			FileInputStream fileInputStream = new FileInputStream("q21.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			MovieSer m = (MovieSer) objectInputStream.readObject();
			MovieSer m1 = (MovieSer) objectInputStream.readObject();
			System.out.println(m);
			System.out.println(m1);
			fileInputStream.close();
			objectInputStream.close();
		}

}
