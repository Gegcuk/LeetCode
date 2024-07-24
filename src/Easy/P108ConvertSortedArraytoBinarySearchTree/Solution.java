package Easy.P108ConvertSortedArraytoBinarySearchTree;

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

public class Solution {
        public TreeNode sortedArrayToBST(int[] nums){
            if(nums == null || nums.length == 0) return null;
            return sortedArrayToBSThelper(nums, 0, nums.length-1);
        }

        private TreeNode sortedArrayToBSThelper(int[] nums, int left, int right){
            if(left > right) return null;
            int mid = left + (right - left)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBSThelper(nums, left, mid - 1);
            node.right = sortedArrayToBSThelper(nums, mid + 1, right);
            return node;
        }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input
        int[] nums = {-10, -3, 0, 5, 9};

        // Calling the method and getting the BST root
        TreeNode root = solution.sortedArrayToBST(nums);

        // Print the tree structure for testing
        printTree(root, 0);
    }

    // Helper method to print the tree
    public static void printTree(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        printTree(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + node.val);
        } else {
            System.out.println(node.val);
        }
        printTree(node.left, level + 1);
    }
}