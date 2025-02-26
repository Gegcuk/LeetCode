package Easy.P203RemoveLinkedListElements;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0), current = temp;
        temp.next = head;
        while(current.next != null){
            if(current.next.val == val) current.next = current.next.next;
            else current = current.next;
        }
        return temp.next;
    }



    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
