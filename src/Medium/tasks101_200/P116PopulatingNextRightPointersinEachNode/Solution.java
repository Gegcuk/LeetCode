package Medium.tasks101_200.P116PopulatingNextRightPointersinEachNode;


import java.util.LinkedList;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelsize = queue.size();
            Node prev = null;

            for(int i = 0; i < levelsize; i++){
                Node currentNode = queue.poll();

                if(prev != null) prev.next = currentNode;

                prev = currentNode;

                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }
        }
        return root;
    }
}
