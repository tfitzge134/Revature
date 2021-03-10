package queue;
import java.util.LinkedList;
//import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	
	
	

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>() ;
		queue.add("jose");
		queue.add("Maria");
		queue.add("Luis");
		System.out.println("Linked List Queue is: " + queue);

	}

}
