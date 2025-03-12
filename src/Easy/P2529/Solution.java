package Easy.P2529;

public class Solution {
    public int maximumCount(int[] nums) {
        if(nums[0] > 0 || nums[nums.length-1] < 0) return nums.length;

        int posCount = countPositives(nums);
        int negCount = countNegatives(nums);

        return Math.max(negCount, posCount);
    }

    private int countNegatives(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int countPositives(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return nums.length - low;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumCount(new int[]{-2,-1,-1,1,2,3}));
        System.out.println(solution.maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
        System.out.println(solution.maximumCount(new int[]{5,20,66,1314}));
        System.out.println(solution.maximumCount(new int[]{-1292,-1238,-947,-571,-338,475,885,984,1483,1503}));
    }
}
