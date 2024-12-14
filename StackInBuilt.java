import java.util.Stack;

public class StackInBuilt {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(10);
		st.push(20);
		st.push(40);

		System.out.println("Highest Element : " + st.peek());
		System.out.println("Popped element : " + st.pop());
		System.out.println("Empty or not :" + st.isEmpty());
		System.out.println(st);

	}
}