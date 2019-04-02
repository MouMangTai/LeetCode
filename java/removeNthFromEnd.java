package 算法;
class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class removeNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int num = 0;
        while(cur!=null) {
        	cur = cur.next;
        	num++;
        }
        if(num==n) {
        	return head.next;
        }
        
        int k = num-n;
        cur = head;
        int i = 0;
        while(cur.next!=null) {
        	i++;
        	if(i==k) {
        		cur.next = cur.next.next;
        		break;
        	}
            cur=cur.next;
        }
        return head;
    }	
}
