package Easy.P35SearchInsertPosition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int position = 0;
        if(nums[0] == target) return position;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == target) return i;
            else if(nums[i] > target && nums[i-1] < target) position = i;
        }
        if(nums[nums.length-1] < target) position=nums.length;
        return position;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = solution.searchInsert(nums1, target1);
        System.out.println("Insert position of " + target1 + " is: " + result1);

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int result2 = solution.searchInsert(nums2, target2);
        System.out.println("Insert position of " + target2 + " is: " + result2);

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int result3 = solution.searchInsert(nums3, target3);
        System.out.println("Insert position of " + target3 + " is: " + result3);

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        int result4 = solution.searchInsert(nums4, target4);
        System.out.println("Insert position of " + target4 + " is: " + result4);
    }
}
