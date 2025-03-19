package Easy.tasks101_200.P141LinkedListCycle;

import java.util.HashSet;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }


public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visitedNodes = new HashSet<>();
        while(head != null) {
            if(visitedNodes.contains(head)) return true;
            visitedNodes.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleWithPointer(ListNode head) {
        ListNode fastPointer= head, slowPointer = head;
        while(fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: List with a cycle
        ListNode head1 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head1.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Creating a cycle here

        // Test case 2: List without a cycle
        ListNode head2 = new ListNode(1);
        ListNode node4 = new ListNode(2);
        head2.next = node4;

        // Test case 3: Single node without a cycle
        ListNode head3 = new ListNode(1);

        System.out.println("Has cycle in list 1: " + solution.hasCycleWithPointer(head1)); // Output should be true
        System.out.println("Has cycle in list 2: " + solution.hasCycleWithPointer(head2)); // Output should be false
        System.out.println("Has cycle in list 3: " + solution.hasCycleWithPointer(head3)); // Output should be false
    }
}
