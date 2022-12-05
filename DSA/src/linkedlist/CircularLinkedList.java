package linkedlist;

public class CircularLinkedList {
	
	public void insert(int val) {
		Node node = new Node(val);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void deleteNode(int value) {
		Node node = head;
		if (node == null)
			return;
		if(node.value== value) {
			head = head.next;
			tail.next = head;
			return;
		}
		do {
			Node n = node.next;
			if(n.value == value) {
					node.next = n.next;
					break;
			}
			node = node.next;
		}while(node != head);
	}


	public void display() {
		Node temp = head;
		if(head  != null) {
			do {
				System.out.print(temp.value + " -> ");
				temp = temp.next;
			}while(temp != head);
		}
		System.out.println(" head ");
	}
	
	private Node head;
	private Node tail;	
	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	private class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
		
	}

}
