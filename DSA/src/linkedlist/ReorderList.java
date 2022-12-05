package linkedlist;

//https://leetcode.com/problems/reorder-list/
public class ReorderList {
	
	public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;           
        }
        
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        
        ListNode headFirst = head;
        
        // arrange the list in given order.
        
        while(headSecond != null &&  headFirst != null){
            ListNode temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;
            
            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
                  
        }
        // next of tail to null
        if(headFirst != null){
            headFirst.next = null;
        }
        
    }
    
    
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
	
}
