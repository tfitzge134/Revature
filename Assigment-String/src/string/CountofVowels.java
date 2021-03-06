package string;
import java.util.Scanner; 

public class CountofVowels {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1)Take a string 
		 * input from user and find the count
		 *  of vowels(aeiouAEIOU) in it.
		 */
		
		int count = 0;
		Scanner scanner = new Scanner(System.in); //create object;
		System.out.println("Enter an String input");
		String userInput = scanner.nextLine();//iput
		System.out.println(userInput);
		for(int i = 0; i< userInput.length(); i++) {
			//System.out.println(userInput[i].toString());
			if(userInput.toLowerCase().charAt(i)=='a' || userInput.toLowerCase().charAt(i) == 'e'
					||userInput.toLowerCase().charAt(i)=='i' || userInput.toLowerCase().charAt(i) == 'o'||
							userInput.toLowerCase().charAt(i) == 'u'
					)
		count ++;
			
		}
	
		
		System.out.println(count);
		

	}
	

}	

//	for (int i = 0; i < scanner.length; i++) {
//		System.out.println(scanner[i].toString());
////		if() {
////			System.out.println(s5[i].toUpperCase());
////		}else {
////			System.out.println(s5[i]);
		//


