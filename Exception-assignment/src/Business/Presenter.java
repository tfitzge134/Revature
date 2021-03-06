package Business;

import java.io.FileNotFoundException;

public class Presenter {

	public static void main(String[] args) {
		Business b =new Business();
		try {
			b.openFile("c://rev/passport.txt");
			System.out.println("File reading successfull");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("File unable to find");
		}
	}

	}


