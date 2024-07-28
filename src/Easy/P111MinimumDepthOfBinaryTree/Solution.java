package Easy.P111MinimumDepthOfBinaryTree;

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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return rightDepth + 1;
        if(root.right == null)
            return leftDepth + 1;
        return Math.min(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        // Creating a tree for the test case [2,null,3,null,4,null,5,null,6]:
        //    2
        //     \
        //      3
        //       \
        //        4
        //         \
        //          5
        //           \
        //            6
        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5, null, node6);
        TreeNode node4 = new TreeNode(4, null, node5);
        TreeNode node3 = new TreeNode(3, null, node4);
        TreeNode root = new TreeNode(2, null, node3);

        Solution solution = new Solution();
        int minDepth = solution.minDepth(root);
        System.out.println("Minimum Depth of the Binary Tree: " + minDepth);
    }
}
