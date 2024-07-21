package Easy.P94BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        innnerInOrderTraversal(resultList,root);
        return resultList;
    }

    public void innnerInOrderTraversal(List list, TreeNode head){
        if(head == null) return;;
        innnerInOrderTraversal(list, head.left);
        list.add(head.val);
        innnerInOrderTraversal(list, head.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();

        // Check preorder traversal
        List<Integer> preorderResult = new ArrayList<>();
        preorderResult = solution.inorderTraversal(root);
        System.out.println("Preorder Traversal: " + preorderResult);
    }
}
