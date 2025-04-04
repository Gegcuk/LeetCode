package Easy.tasks2701_2800.P2765LongestAlternatingSubArray;

public class Solution {
    public int alternatingSubarray(int[] nums) {
        int n = nums.length, res = -1, dp = -1;
        for (int i = 1; i < n; ++i, res = Math.max(res, dp))
            if (dp > 0 && nums[i] == nums[i - 2])
                dp++;
            else
                dp = nums[i] == nums[i - 1] + 1 ? 2 : -1;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.alternatingSubarray(new int[]{42,43,44,43,44,43,44,45,46}));
        System.out.println(solution.alternatingSubarray(new int[]{4,5,6}));
    }
}
