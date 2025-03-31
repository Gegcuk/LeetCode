package Easy.tasks2001_2100.P2016MaximumDifferenceBetweenIncreasingElements;

public class Solution {

    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int diff = -1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > min) diff = Math.max(diff, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return diff;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumDifference(new int[]{1,5,2,10}));
    }


}
