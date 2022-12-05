package linkedlist;

public class PalindromeLinkedList {
	// find mid node,, reverse the list and compre the list by head and headSecond and re reverse the list
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    
    public ListNode reverseList(ListNode head) {

		// edge case// list is empty.
		if (head == null)
			return head;
		// theree pointer ,, prev , present ,,next
		ListNode prev = null;
		ListNode present = head;
		ListNode next = present.next;

		while (present != null) {
			present.next = prev;  // point to null... 
			prev = present;
			present = next;
			if (next != null) {
				next = next.next;
			}

		}
		return prev;  // head = prev'

	}
    
    
    public boolean isPalindrome(ListNode head) {
        // find mid and reverse the second list,, compare both list from head and headSecond  ..and re reverse the second list
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reReversehead = headSecond;
        
        // compare both the halves
        while(head  != null && headSecond != null){
            if(head.val != headSecond.val) { // not palindorme
                return false;
            }
            // increment till head and headSecond not null
            head = head.next;
            headSecond = headSecond.next;
            
        }
        
        reverseList(reReversehead);  //re reversing the entire list so that list structure cant be modified..
        return true;
        // return if we traverse the entire list and not break in between
        // if(head == null && headSecond == null) return true; 
    }
    }
	
 class ListNode{
		 int val;
		ListNode next;
		public ListNode(int val, ListNode next) {
			super();
			this.val= val;
			this.next = next;
		}
		
}
