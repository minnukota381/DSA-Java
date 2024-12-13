package QueueDemo;

class Queue {
	private int[] arr = new int[5];
	private int front = 0, rear = -1;

	public void enqueue(int x) {
		if (rear == arr.length - 1) {
			System.out.println("Queue Overflow");
			return;
		}
		arr[++rear] = x;
	}

	public int dequeue() {
		if (front > rear) {
			System.out.println("Queue Underflow");
			return -1;
		}
		return arr[front++];
	}

	public int peek() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[front];
	}

	public boolean isEmpty() {
		return front > rear;
	}

	public void display() {
		if (front > rear) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

public class QueueUsingArray {
	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		queue.display();

		System.out.println("Front element: " + queue.peek());
		System.out.println("Removed element: " + queue.dequeue());
		queue.display();
	}
}
