package StackDemo;

class Stack {
	int arr[] = new int[5];
	int top = -1;

	public void push(int item) {
		if (top == arr.length - 1) {
			System.out.println("Stack is Overflow");
			return;
		}
		arr[++top] = item;
	}

	public void peek() {
		System.out.println("Peek Element :" + arr[top]);
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Underflow");
			return;
		}
		System.out.println("Popped Element :" + arr[top]);
		int f = arr[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

}

public class StackExampleUsingArray {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(100);
		s.push(200);

		s.peek();// 200
		s.pop(); // 200
		s.pop(); // 100
		s.pop(); // 10

		System.out.println(s.isEmpty());

	}
}
