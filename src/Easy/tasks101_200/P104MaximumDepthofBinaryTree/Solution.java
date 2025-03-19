package Easy.tasks101_200.P104MaximumDepthofBinaryTree;

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

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if(lDepth > rDepth)
                return lDepth+1;
            else
                return rDepth+1;
        }
    }
}
