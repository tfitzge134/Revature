package sum;
import java.util.Scanner;

public class SumOfNumbers {
	/*
	 * Find the sum of all even numbers between 1 and 100, also find sum of all odd numbers between 1 and 100 and print the results and
 * print which is largest among them(between evensum and oddsum)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int oddSum = 0;
	int evenSum =0;
	int number = 100;
	for (int i = 1; i <= number; i++) {
		if(i%2 != 0) {
			oddSum +=i;
			System.out.println(oddSum);
		}
		else if (i%2 == 0) {
			evenSum +=1;
			System.out.println("evenSum " + evenSum);
			
		}else {
			System.out.println("hi");
		}
		
	}
	if(rev==sum)
		System.out.println("it is a palindrome number ");
	else
		System.out.prinln(" is not a palindrome");
 
	}

}
