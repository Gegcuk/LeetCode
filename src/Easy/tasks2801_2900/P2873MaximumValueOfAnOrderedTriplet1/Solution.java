package Easy.tasks2801_2900.P2873MaximumValueOfAnOrderedTriplet1;

public class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                if(nums[i] - nums[j] < 0) break;
                for(int k = j + 1; k < nums.length; k++){
                    if((long) (nums[i] - nums[j]) * nums[k] > max) max = (long) (nums[i] - nums[j]) * nums[k];
                }
            }
        }
        return max >= 0 ? max : 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumTripletValue(new int[]{12,6,1,2,7}));
        System.out.println(solution.maximumTripletValue(new int[]{1,10,3,4,19}));
        System.out.println(solution.maximumTripletValue(new int[]{1,2,3}));
    }
}
