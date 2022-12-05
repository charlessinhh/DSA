package linkedlist;

public class RotateLinkedList {
	public ListNode rotateRight(ListNode head, int k) {
        if(k == 0){
            return head;
        }
        ListNode lenNode = head;
        int length = 0;
        if(lenNode == null){
            length = 0;
        }
        else
        {
            while(lenNode != null){
                lenNode = lenNode.next;
                length++;
            }
        }
        if(length != 0){
            k = k % length;
        }    
        
        ListNode temp = head;
        if(head == null || head.next == null)
            return head;
         while(k>0){
             while(temp.next.next != null){
                 temp = temp.next;
             }
             temp.next.next = head;
             head = temp.next;
             temp.next = null;
             temp = head;
        
             k--;
         }
        return head;
        
    }
}
