package Easy.P100SameTree;


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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        // Create first sample tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);

        // Create second sample tree:
        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        tree2.left.left = new TreeNode(4);
        tree2.left.right = new TreeNode(5);

        // Create third sample tree:
        //         1
        //        / \
        //       2   3
        //      /
        //     4
        TreeNode tree3 = new TreeNode(1);
        tree3.left = new TreeNode(2);
        tree3.right = new TreeNode(3);
        tree3.left.left = new TreeNode(4);

        Solution solution = new Solution();

        // Check if tree1 and tree2 are the same
        boolean result1 = solution.isSameTree(tree1, tree2);
        System.out.println("Tree1 and Tree2 are the same: " + result1);

        // Check if tree1 and tree3 are the same
        boolean result2 = solution.isSameTree(tree1, tree3);
        System.out.println("Tree1 and Tree3 are the same: " + result2);
    }
}
