package Medium.tasks3101_3200.P3191MinimumOperationstoMakeBinaryArrayElementsEqualtoOne;

public class Solution {
    public int minOperations(int[] nums) {
        int left = 0;
        int mid = 1;
        int right = 2;
        int counter = 0;
        int length = nums.length;
        while(right < length){
            if(nums[left] == 0) {
                nums[left] = 1;
                nums[mid] = nums[mid] == 1 ? 0 : 1;
                nums[right] = nums[right] == 1 ? 0 : 1;
                counter++;
            }
            left++;
            mid++;
            right++;
        }

        if(nums[length-1] == 0 || nums[length-2] == 0) return -1;
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minOperations(new int[]{0, 1, 1, 1, 0, 0}));
        System.out.println(solution.minOperations(new int[]{1, 0, 1, 0, 1, 1, 0, 0, 1, 0 ,1}));
    }
}
