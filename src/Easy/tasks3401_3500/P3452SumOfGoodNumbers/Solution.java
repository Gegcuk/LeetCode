package Easy.tasks3401_3500.P3452SumOfGoodNumbers;

public class Solution {

    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int curLeft, curRight;
        for(int i = 0; i < nums.length; i++){
            curLeft = i - k >= 0 ? nums[i - k] : 0;
            curRight = i + k < nums.length ? nums[i + k] : 0;
            if(nums[i] > curLeft && nums[i] > curRight) sum += nums[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.sumOfGoodNumbers(new int[]{1,3,2,1,5,4}, 2);
    }

}
