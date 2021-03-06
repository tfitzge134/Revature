package fileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFoundDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("c://Users/teresa/Desktop/test.js");
		FileReader fr = new FileReader(file);

	}

}
