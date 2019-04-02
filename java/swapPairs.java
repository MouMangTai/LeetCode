package 算法;
public class swapPairs {
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null) return head;
        ListNode cur = head;
        ListNode next = head.next;
        ListNode temp = null;
        head = next;
        while(next!=null) {
        	ListNode last = next.next;
        	next.next = cur;
        	cur.next = last;
            if(temp==null) temp = cur;
        	else{
                temp.next = next;
        	    temp = next;
            }
        	cur = last;
        	if(cur!=null) next = cur.next;
        	else break;
        }
        return head;
    }
}
