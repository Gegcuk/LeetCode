package Medium.tasks101_200.P162FindPeakElement;

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        if(nums.length == 2) return nums[0] > nums[1] ? 0 : 1;
        for(int i = 1; i < nums.length-1; i++){
            if(nums[0] > nums[1]) return 0;
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
        }
        return nums.length-1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        int[] nums1 = {1, 2, 3, 1};
//        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
//        int[] nums3 = {1};
//        int[] nums4 = {3, 2};
        int[] nums5 = {1, 2, 3};
//        int[] nums6 = {3, 2, 1};

//        System.out.println("Peak index in nums1: " + solution.findPeakElement(nums1)); // Expected output: 2
//        System.out.println("Peak index in nums2: " + solution.findPeakElement(nums2)); // Expected output: 5 (or 1)
//        System.out.println("Peak index in nums3: " + solution.findPeakElement(nums3)); // Expected output: 0
//        System.out.println("Peak index in nums4: " + solution.findPeakElement(nums4)); // Expected output: 0
        System.out.println("Peak index in nums5: " + solution.findPeakElement(nums5)); // Expected output: 1
//        System.out.println("Peak index in nums6: " + solution.findPeakElement(nums6)); // Expected output: 1
    }
}