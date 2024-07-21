package Easy.P83RemoveDuplicatesfromSortedList;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.val == currentNode.val){
                if(currentNode.next.next != null){
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                }
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode node5 = new ListNode(3);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode head = new ListNode(1, node2);

        Solution solution = new Solution();
        ListNode newHead = solution.deleteDuplicates(head);

        // Print the resulting linked list
        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}