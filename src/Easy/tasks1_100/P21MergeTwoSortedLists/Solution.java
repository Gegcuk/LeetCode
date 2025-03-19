package Easy.tasks1_100.P21MergeTwoSortedLists;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultList = new ListNode();
        ListNode currentNode = resultList;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        if(list1 != null) {
            currentNode.next = list1;
        } else if (list2 != null){
            currentNode.next = list2;
        }
        return resultList.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create test list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(3);

        // Create test list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(7);

        // Merge the lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


