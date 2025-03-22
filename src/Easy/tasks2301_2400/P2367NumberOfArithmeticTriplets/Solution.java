package Easy.tasks2301_2400.P2367NumberOfArithmeticTriplets;

public class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {

        int leftPointer = 0;
        int rightPointer = 1;
        int leftNumber;
        int rightNumber;
        int counter = 0;
        for(int i = nums.length - 1; i >= 2; i--){
            int currentBigNumber = nums[i];
            for(rightPointer = i - 1; rightPointer >= 1; rightPointer--){
                for(leftPointer = rightPointer - 1; leftPointer >= 0; leftPointer--){
                    leftNumber = nums[leftPointer];
                    rightNumber = nums[rightPointer];
                    if((currentBigNumber - rightNumber) == diff && (rightNumber - leftNumber == diff)) counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.arithmeticTriplets(new int[]{4,5,6,7,8,9}, 2);
    }

}
