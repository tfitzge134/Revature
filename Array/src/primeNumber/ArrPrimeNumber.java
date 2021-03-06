package primeNumber;
import java.util.*;
import java.util.Scanner;

public class ArrPrimeNumber {
	 //Take an array input and find all the prime numbers from it.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
	    int i, j, counter=0, last;
//		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter size of array");
	int n = sc.nextInt();
	    
	    int arr[]= new int [n];
	    System.out.println("Enter the values by pressing the enter key per each value");
	    for (i=0; i<n;i++)
	    {
	        arr[i]= sc.nextInt();
	    }
	    for (i=0; i< n; i++)
	    {
	       
	        last = arr[i];
	    
	        if(last <= 1)continue;

	        counter = 0;
	        for (j=2;j<last;j++)
	        {
	            if(arr[i]%j==0)
	                counter++;

	        }
	        if (counter == 0)
	        {
	            System.out.println(arr[i]+" is a Prime Number");

	        }
	    }


	}


	}
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter size of array");
//		int n = scanner.nextInt();
//		System.out.println("enter " + n + " elements ");
//	
//		int ar[]=new int[n];
//		for (int i = 0; i < n; i++) {
//			ar[i]=scanner.nextInt();
//			System.out.println(Arrays.toString(ar));
//					
//	}
//
//	}
//	public static boolean isPrime(int n) {
//		int c=0;
//		for (int i = 1; i <=n; i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==2) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//}

//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	
//	System.out.println("Enter size of array");
//	int n=sc.nextInt();
//	System.out.println("Enter "+n +" elements");
//	int ar[]=new int[n];
//	for (int i = 0; i < n; i++) {
//		ar[i]=sc.nextInt();
//	}
//	System.out.println("Array before sorting");
//	System.out.println(Arrays.toString(ar));
//	Arrays.sort(ar);
//	System.out.println("\nArray after sorting");
//	System.out.println(Arrays.toString(ar));
//	