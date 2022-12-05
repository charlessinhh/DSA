package linkedlist;

//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
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
