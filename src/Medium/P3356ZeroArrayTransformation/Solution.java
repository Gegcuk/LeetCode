package Medium.P3356ZeroArrayTransformation;

public class Solution {

    public int minZeroArray(int[] nums, int[][] queries) {

        int left = 0, right = queries.length;
        int answer = -1;

        while (left <= right) {
            int mid = (right - left)/2;
            if(isZeroArray(nums, queries, mid)){
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;

    }

    private boolean isZeroArray(int[] nums, int[][] queries, int mid) {
        int n = nums.length;
        int[] delta = new int[n + 1];
        int[] temp = nums.clone();

        for(int i = 0; i < mid; i++){
            int left = queries[i][0], right = queries[i][1], value = queries[i][2];
            delta[left] -=value;
            if(right + 1 < n) delta[right + 1] += value;
        }

        int currentDecrement = 0;
        for(int i = 0; i < n; i++){
            currentDecrement = delta[i];
            temp[i] += currentDecrement;
            if(temp[i] > 0) return false;
        }
        return true;
    }

}
