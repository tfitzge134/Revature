package arrevennumber;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumber {
	//Take an array input and find the sum of all even numbers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
	    int i;
//		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter size of array");
	int n = sc.nextInt();
	    
	    int arr[]= new int [n];
	    System.out.println("Enter the values by pressing the enter key per each value");
	    for (i=0; i<n;i++)
	    {
	        arr[i]= sc.nextInt();
	       
	    }
	    System.out.println(Arrays.toString(arr));
	}

}
