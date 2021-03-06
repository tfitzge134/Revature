package string;

public class LastCharToUpperCase {
	/*
	 * 1)Take a sentence as input and convert 
	 * all the last chars to upper case of every word
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "Hello World";
	
		
 System.out.println("Last string upper case is " + str.toUpperCase().charAt(str.length()-1) + " from " + str);

	}

}
