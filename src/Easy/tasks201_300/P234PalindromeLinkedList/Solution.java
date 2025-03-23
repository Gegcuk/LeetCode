package Easy.tasks201_300.P234PalindromeLinkedList;


import Easy.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        if  ((head.next.next == null) && (head.val != head.next.val)) return false;
        int nodesLength = 0;
        ListNode tempHead = head;
        while(tempHead != null) {
            nodesLength++;
            tempHead = tempHead.next;
        }
        int[] nodeValsArray = new int[nodesLength];
        tempHead= head;
        for(int i = 0; i < nodeValsArray.length; i++){
            nodeValsArray[i] = tempHead.val;
            tempHead = tempHead.next;
        }
        int right, left;
        int mid = nodesLength/2;
        right = nodesLength % 2 == 0 ? mid: mid + 1;
        left = mid-1;
        while(left >= 0 && right < nodesLength) {
            if(nodeValsArray[left] != nodeValsArray[right]) return false;
            left--;
            right++;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(1)))));
        System.out.println(solution.isPalindrome(listNode));
    }

}
