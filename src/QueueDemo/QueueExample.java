package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(10);
		queue.add(20);
		queue.add(30);

		System.out.println("Front element: " + queue.peek());

		System.out.println("Removed element: " + queue.poll());

		System.out.println("Is queue empty? " + queue.isEmpty());

		System.out.println("Queue: " + queue);
	}
}
