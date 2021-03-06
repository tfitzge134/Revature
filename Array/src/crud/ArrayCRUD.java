package crud;

public class ArrayCRUD {
	//Perform CRUD operations on Array
	public static void main(String[] args) {
		int ar[]=new int[6];
		ar[0]=20;
		ar[1]=40;
		ar[2]=57;
		ar[3]=456;
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		/*Updating Array
		 * at position 2 with element 16
		 * 
		 */
		int element = 16;
		int pos = 2;
		for (int i = n; i> pos-1; i--) {
		ar[i]=ar[i-1];   //updating
			//System.out.print(ar[i] + " ");
		}
		ar[pos-1]=element; //inserting 
		n++;
		
		System.out.println("\n\nAfter Insertion");
	
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		int deleteposition=2;
		for (int i = deleteposition-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+deleteposition);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
