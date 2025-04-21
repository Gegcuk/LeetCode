package Easy.tasks901_1000.P908SmallestRange1;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return max - min > k*2 ? max - min - k*2 : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestRangeI(new int[]{1}, 0));
        System.out.println(solution.smallestRangeI(new int[]{0,10}, 2));
        System.out.println(solution.smallestRangeI(new int[]{1,3,6}, 3));
    }

}
