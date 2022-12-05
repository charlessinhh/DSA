import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack);
		System.out.println(stack.pop());
		stack.push(10);
		stack.push(12);
		stack.push(14);
		stack.push(16);
		stack.push(18);
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
