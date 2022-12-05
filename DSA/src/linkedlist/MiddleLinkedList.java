package linkedlist;

public class MiddleLinkedList {
	private class ListNode{
		int val;
		ListNode next;
	}
	
	
//	https://leetcode.com/problems/middle-of-the-linked-list/submissions/
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
