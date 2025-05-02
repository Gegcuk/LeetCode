package Medium.tasks101_200.P117PopulatingNextRightPointersInEachNode2;


import utils.Node;

public class Solution {

    public Node connect(Node root) {
        if(root == null) return root;
        Node head = root;

        while (head != null){
            Node nodeForNext = new Node(0);
            Node temp = nodeForNext;

            while (head != null){
                if(head.left != null){
                    nodeForNext.next = head.left;
                    nodeForNext = nodeForNext.next;
                }
                if(head.right != null){
                    nodeForNext.next = head.right;
                    nodeForNext = nodeForNext.next;
                }
                head = head.next;
            }
            head = temp.next;
        }
        return root;
    }

}