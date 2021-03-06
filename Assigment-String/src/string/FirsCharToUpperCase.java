package string;

import java.util.Scanner;

public class FirsCharToUpperCase {
/*
 * // first character to uppercase.
 * 
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "Hello World";
		Scanner scanner = new Scanner(System.in); //create object;
		System.out.println("Enter an String input");
		String userInput = scanner.nextLine();//iput
		System.out.println(userInput.toString());
	
		
		//System.out.println("First string upper case is " + userInput.toUpperCase().charAt(0) + " from " + userInput);
		
	}

}
