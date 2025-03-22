package Easy.tasks201_300.P234PalindromeLinkedList;


import Easy.ListNode;

public class Solution {

    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if  (head.val != head.next.val) return false;
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
        int right, left = 0;
        int mid = nodesLength/2;
        right = mid % 2 == 0 ? mid + 1 : mid + 2;
        while(left >= 0 && right < nodesLength) {
            if(nodeValsArray[left] != nodeValsArray[right]) return false;
            left--;
            right++;
        }
        return true;
    }

}
