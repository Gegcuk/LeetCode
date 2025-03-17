package Easy.P2206DivideArrayIntoEqualsPairs;

class Solution {
    public boolean divideArray(int[] nums) {

        int n = nums.length;
        if(n == 2) return nums[0] == nums[1];

        int[] freqArr = new int[501];
        for(int i = 0; i < nums.length; i++){
            freqArr[nums[i]]++;
        }
        for(int i = 0; i < 501; i++){
            if(freqArr[i] %2 != 0) return false;
        }
        return true;
    }
}
