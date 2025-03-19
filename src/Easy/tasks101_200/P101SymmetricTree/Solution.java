package Easy.tasks101_200.P101SymmetricTree;


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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return innerIsSymmetric(root.left, root.right);
    }

    private boolean innerIsSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null || left.val != right.val)
            return false;
        return innerIsSymmetric(left.left, right.right) && innerIsSymmetric(left.right, right.left);
    }

    public static void main(String[] args) {
        // Create a symmetric tree:
        //         1
        //        / \
        //       2   2
        //      / \ / \
        //     3  4 4  3
        TreeNode symmetricTree = new TreeNode(1);
        symmetricTree.left = new TreeNode(2);
        symmetricTree.right = new TreeNode(2);
        symmetricTree.left.left = new TreeNode(3);
        symmetricTree.left.right = new TreeNode(4);
        symmetricTree.right.left = new TreeNode(4);
        symmetricTree.right.right = new TreeNode(3);

        // Create an asymmetric tree:
        //         1
        //        / \
        //       2   2
        //        \   \
        //         3   3
        TreeNode asymmetricTree = new TreeNode(1);
        asymmetricTree.left = new TreeNode(2);
        asymmetricTree.right = new TreeNode(2);
        asymmetricTree.left.right = new TreeNode(3);
        asymmetricTree.right.right = new TreeNode(3);

        Solution solution = new Solution();

        // Check if symmetricTree is symmetric
        boolean result1 = solution.isSymmetric(symmetricTree);
        System.out.println("Symmetric Tree is symmetric: " + result1);

        // Check if asymmetricTree is symmetric
        boolean result2 = solution.isSymmetric(asymmetricTree);
        System.out.println("Asymmetric Tree is symmetric: " + result2);
    }
}
