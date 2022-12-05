package linkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private int size ;
	
	public DoublyLinkedList() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null)   // null pointer exception
			head.prev = node;
		head = node;
		size++;
	}
	
	public void insertLast(int val) {
		Node last = head;
		if(head == null) {
			insertFirst(val);
			return;
		}
		while(last.next != null) {
			last = last.next;
		}
		Node node = new Node(val);
		node.next = null;
		last.next = node;
		node.prev = last;
		size++;
	}

	public void insertAtPos(int pos, int val) {
		if (pos == 1) {
			insertFirst(val);
			return;
		}
//		if(pos == size+1) {
//			insertLast(val);
//			return;
//		}
		Node temp = head;
		for(int i = 1; i< pos-1;i++) {
			temp = temp.next;
		}
		Node node = new Node(val);
		node.next = temp.next;
		if(temp.next  != null ) {  // null pointer exception , can use insertLast also
			temp.next.prev = node;
		}
		node.prev = temp;
		temp.next = node; 
		size++;
	}
	
	
	
	public void display() {
		Node temp = head;
//		Node last = null;/ for reversing the list 
		while(temp != null) {
			System.out.print(temp.value + " <--> ");
//			last = temp;
			temp = temp.next;
		}
		System.out.println("end");
		
		//reverse of DLL
//		while(last != null) {
//			System.out.print(last.value + " <- ");
//			last = last.prev;
//		}
//		System.out.println("start");
	}
	

	private class Node{
		int value;
		Node next;
		Node prev;
		
		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}	
	}
}
