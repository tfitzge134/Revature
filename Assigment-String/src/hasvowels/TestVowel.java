package hasvowels;
import java.io.IOException;

import java.util.Scanner;

public class TestVowel {

	public static void main(final String[] args)throws IOException {
		try (final Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
            final String word = scanner.nextLine();
            if (HasVowels(word)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}

	private static boolean HasVowels(String word) {
		// TODO Auto-generated method stub
		return false;
	}
}

    
	
	
