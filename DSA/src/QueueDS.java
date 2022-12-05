import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue <Integer> queue = new LinkedList<>();
//		queue.add(3);
//		queue.add(5);
//		queue.add(13);
//		queue.add(4);
//		queue.add(56);
//		
//		System.out.println(queue);
//		System.out.println(queue.peek());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue);
		
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(10);
		deque.addFirst(9);
		
		deque.addLast(98);
		deque.addLast(99);
		System.out.println(deque);
		deque.remove();
		System.out.println(deque);
	}

}
