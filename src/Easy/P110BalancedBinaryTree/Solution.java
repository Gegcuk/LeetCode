package Easy.P110BalancedBinaryTree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(branchDepth(root) == -1) return false;
        return true;
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
