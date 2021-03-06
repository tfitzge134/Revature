package Business;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Business {

	
	public void openFile(String passport) throws FileNotFoundException {
		FileInputStream fos=new FileInputStream(passport);
	}
}


//Create a BusinessException(checked) and use it 
//for handling for InvalidPassportNumber

