package Easy.P144BinaryTreePreorderTraversal;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        innerPreorder(resultList, root);
        return resultList;
    }

    private void innerPreorder(List list, TreeNode node){
        if (node == null) return;
        list.add(node.val);
        innerPreorder(list, node.left);
        innerPreorder(list, node.right);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Binary tree [1, null, 2, 3]
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        // Test case 2: Binary tree [3, 9, 20, null, null, 15, 7]
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        // Test case 3: Empty tree []
        TreeNode root3 = null;

        System.out.println("Preorder traversal of tree 1: " + solution.preorderTraversal(root1)); // Output should be [1, 2, 3]
        System.out.println("Preorder traversal of tree 2: " + solution.preorderTraversal(root2)); // Output should be [3, 9, 20, 15, 7]
        System.out.println("Preorder traversal of tree 3: " + solution.preorderTraversal(root3)); // Output should be []
    }
}
