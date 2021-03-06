package hasvowels;

import java.util.Scanner;

public class HasVowells {

	public static void main(finalString[] args) throws IOException{
		// TODO Auto-generated method stub
		try (final Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
            final String word = scanner.nextLine();
            if (hasAll(word)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

	private static boolean hasAll(String word) {
		   boolean hasA = false;
	        boolean hasE = false;
	        boolean hasI = false;
	        boolean hasO = false;
	        boolean hasU = false;

	        for (int i = 0; i < input.length(); i++) {
	            switch (input.charAt(i)) {
	            case 'a':
	                hasA = true;
	                break;
	            case 'e':
	                hasE = true;
	                break;
	            case 'i':
	                hasI = true;
	                break;
	            case 'o':
	                hasO = true;
	                break;
	            case 'u':
	                hasU = true;
	                break;
	            default:
	                continue;
	            }

	            if (hasA && hasE && hasI && hasO && hasU) {
	                return true;
	            }
	        }
	        return false;
	    }


	}


