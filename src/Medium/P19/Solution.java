package Medium.P19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int nodeCounter = 0;
        int nodeToDelete = 0;
        ListNode currentNode = head;
        while(currentNode != null){
            nodeCounter++;
            currentNode = currentNode.next;
        }
        System.out.println(nodeCounter);
        if(nodeCounter == 1) return null;
        if(nodeCounter == 2 && n == 1) {
            head.next = null;
            return head;
        }
        if(nodeCounter == n) return head.next;
        nodeToDelete = nodeCounter - n;
        currentNode = head;
        for(int i = 0; i < nodeToDelete - 1; i++){
            currentNode = currentNode.next;
        }
        System.out.println("To delete: " + nodeToDelete + "node to delete val: " + currentNode.val +
                " next val = " + currentNode.next.val);
        currentNode.next = currentNode.next.next;


        return head;
    }

    public static void main(String[] args) {
        // Test case 1: Remove the 2nd node from the end of the list [1,2,3,4,5]
        int[] values1 = {1, 2, 3, 4, 5};
        ListNode head1 = createLinkedList(values1);
        System.out.println("Original list: " + linkedListToString(head1));
        int n1 = 2;
        Solution sol = new Solution();
        head1 = sol.removeNthFromEnd(head1, n1);
        System.out.println("Modified list after removing " + n1 + "th node from the end: " + linkedListToString(head1));

        // Test case 2: Remove the head (n equals the list length) from the list [1,2,3]
        int[] values2 = {1, 2, 3};
        ListNode head2 = createLinkedList(values2);
        System.out.println("\nOriginal list: " + linkedListToString(head2));
        int n2 = 3;
        head2 = sol.removeNthFromEnd(head2, n2);
        System.out.println("Modified list after removing " + n2 + "th node from the end (head removal): " + linkedListToString(head2));

        // You can add additional test cases as needed...
    }

    private static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert the linked list to a string representation
    private static String linkedListToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(" -> ");
            }
            head = head.next;
        }
        return sb.toString();
    }
}



  class ListNode {

    int val;

    ListNode next;


    ListNode() {
    }


    ListNode(int val) {
        this.val = val;
    }


    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
