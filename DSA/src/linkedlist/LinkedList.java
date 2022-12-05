package linkedlist;

public class LinkedList {
	// every LL having head and tail..
	private Node head;  // Reference variable pointing to head node
	private Node tail;     // Reference variable pointing to tail node
	
	private int size;   // size of LL
	public LinkedList() {  // constructor   
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		if(tail == null)
			tail = head;
		size++;
	}
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return ;
		}
		Node node = new Node(val);
		tail.next = node;
		tail  =  node;
		tail.next = null;
		size++;	
	}
	
	public void insertAtPos(int pos , int val) {
		if(pos > size+1) {
			System.out.println(" array index out of bounds");
		}
		else {
		if(pos == 1) {
			insertFirst(val);
			return;
		}
		if(pos == size+1 ) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		for(int i = 1; i< pos-1;i++) {
			temp = temp.next;
		}
		//create the new node to add with val and next of current (temp)
		Node node = new Node(val);
		node.next = temp.next;
		temp.next = node;
		size++;
		}
	}
	
	public int deleteFirst() {
		int val = head.value;
		Node temp = head;
		head = head.next;
		temp.next = null;
		if(head == null ) {
			tail = null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		Node secondLast = getPrevNode(size - 1);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}
	
	public int deleteAtPos(int pos) {
		if (pos == 1) {
			return deleteFirst();
		}
		if(pos == size) {
			return deleteLast();
		}
		Node prev = getPrevNode(pos - 1);  // -1 because we have to go node.next = prev node so 
		int val = prev.next.value;
		prev.next = prev.next.next;
		
		return val;
		
	}
	
	public void deleteNode(int val) {
		Node temp = head;
		if(head == null) {
			return;
		}
		
		// delete first element means head
		if(head.value == val) {
			head = head.next;
			temp.next = null;
			if(head == null ) { // no element present
				tail = null;
			}
			size--;
			return;
		}
		
		while(temp.next.value != val ) {
			temp = temp.next;
		}
		
		Node temp11 = temp.next;
		temp.next = temp.next.next;
		temp11.next = null;
		size--;
	}
	
	public Node findPrevNode(int value) {
		Node node = head;
		Node prev = head;
		while(node != null) {
			if(node.value == value) {  // prev node of actual node
				return prev;
			}
			prev = node;
			node = node.next;
		}
		return null;
	}
	
	public Node getPrevNode(int pos) {
		//take temp node to second last node of LL
		Node node = head;  // temp node
		for(int i  = 1 ; i < pos; i++) {
			node = node.next;
		}
		return node;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value+ " -> ");
			temp = temp.next;
		}
		System.out.println(" End ");
		System.out.println("size = "+size);
	}
	
	//create a node class to create node of each data value with next pointer Node
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value, Node next) { // constructor
			this.value = value;
			this.next = next;
		}
		
		public Node(int value) {  // constructor
			this.value = value;
		}
		
	}
	
	//delete duplicates from  sorted LL  1,2,2,3,3,4 -> 1,2,3,4
	public void duplicate() {
		Node node = head;
		while(node.next != null) {
			if(node.value == node.next.value) {
				node.next = node.next.next;
			}
			else {
				node = node.next;
			}
		}
		tail = node;
		size--;
	}
	
	public static LinkedList merge(LinkedList first, LinkedList second) {
		Node f = first.head;
		Node s = second.head;
		
		LinkedList ans = new LinkedList();
		while(f != null && s != null ) {
			if(f.value < s.value ) {
				ans.insertLast(f.value);
				f = f.next;  // increment of  f node
			}
			else {
				ans.insertLast(s.value);
				s = s.next;    // increment of s node
			} 
		}
		
		while(f != null) {
			ans.insertLast(f.value);
			f = f.next;  // increment of  f node
		}
		while(s != null) {
			ans.insertLast(s.value);
			s = s.next; // increment of s node
		}
		return ans;
	}
	
	
	//https://leetcode.com/problems/linked-list-cycle
	public boolean detectCycle(Node head) {
		// two pointer approach ,, fast and slow
		// fast = fast+2
		//slow = slow+1
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {  // cycle detected
				return true;
			}
		}
		return false;
	}
	
	public int cycleLength(Node head) {
			//calculate length of the cycle
			// we will take temp = slow and rotate again in cycle and length ++ till temp != slow
			Node fast = head;
			Node slow = head;
			
			while( fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow) {
					Node temp = slow;
					int length = 0;
					do {
						temp = temp.next;
						length ++;
					}while(temp != slow);
					return length;
				}
			}
			return 0;
	}
	
	
	//https://leetcode.com/problems/linked-list-cycle-ii/
	// can be also used to delete the single duplicate in array .. by cycle detection
	public Node detectCycleNode(Node head) {
        int length = 0;  // find length of cycle and move second pointer to length and then move first and second by one step till they will meet at starting node and return that node..
        Node fast = head;
        Node slow = head;
        
        while( fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
            	Node temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
        }
        if (length == 0)  // no cycle is present..
            return null;
        
        // find the cycle start node
        Node first = head;
        Node second = head;
        while(length >0){
            second = second.next;
            length --;
        }
        // now keeping both moving foward by one step ,,they will meet at starting node..
        
        while(first != second){
            first = first.next;
            second = second.next;
        }
        return second;  // return first
    }
	
	public Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
	
}
