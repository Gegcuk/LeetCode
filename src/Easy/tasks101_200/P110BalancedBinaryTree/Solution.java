package Easy.tasks101_200.P110BalancedBinaryTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){this.val = val;}
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return branchDepth(root) != -1;
    }

    private int branchDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = branchDepth(root.left);
        int rightDepth = branchDepth(root.right);
        if(leftDepth == -1 || rightDepth == -1) return -1;
        if(Math.abs(leftDepth - rightDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example tree creation
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        // Calling the method and printing the result
        boolean isBalanced = solution.isBalanced(root);
        System.out.println("Is the tree balanced? " + isBalanced);
    }
}
