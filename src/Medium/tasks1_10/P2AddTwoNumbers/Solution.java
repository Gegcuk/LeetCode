package Medium.tasks1_10.P2AddTwoNumbers;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum/10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create test list1: 2 -> 4 -> 3 (represents 342)
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        // Create test list2: 5 -> 6 -> 4 (represents 465)
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        // Add the two lists
        ListNode resultList = solution.addTwoNumbers(list1, list2);

        // Print the result list
        System.out.print("Result List: ");
        while (resultList != null) {
            System.out.print(resultList.val + " ");
            resultList = resultList.next;
        }
    }
}
