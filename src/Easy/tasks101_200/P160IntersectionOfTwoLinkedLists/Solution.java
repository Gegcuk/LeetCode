package Easy.tasks101_200.P160IntersectionOfTwoLinkedLists;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB == null || headA == null) return null;

        ListNode headAcopy = headA;
        ListNode headBcopy = headB;

        while(headAcopy != headBcopy){
            headAcopy = headAcopy == null ? headB : headAcopy.next;
            headBcopy = headBcopy == null ? headA : headBcopy.next;
        }

        return headAcopy;
    }

    public static void main(String[] args) {
        // Create list nodes for List A
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(9);
        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        ListNode c3 = new ListNode(4);

        // Link list A
        a1.next = a2;
        a2.next = c1;

        // Create list nodes for List B
        ListNode b1 = new ListNode(3);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(4);

        // Link list B
        b1.next = c2;
        b2.next = b3;
        b3.next = c1;

        // Link common part
        c1.next = c2;
        c2.next = c3;

        // Create a solution instance
        Solution solution = new Solution();

        // Find the intersection node
        ListNode intersection = solution.getIntersectionNode(a1, b1);

        // Print the result
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}