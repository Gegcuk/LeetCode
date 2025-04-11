package Easy.tasks3201_3300.P3226NumberOfBitChangesToMakeTwoIntegersEqual;

public class Solution {

    public int minChanges(int n, int k) {
        int counter = 0;
        int bitN, bitK;
        for(int i = 31; i >= 0; i--){
            bitN = (n >> i) & 1;
            bitK = (k >> i) & 1;
            if(bitN == 1 && bitK == 0) counter++;
            if(bitN == 0 && bitK == 1) return -1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.minChanges(13, 4));
        System.out.println(solution.minChanges(14, 13));
        System.out.println(solution.minChanges(21, 21));
    }

}
