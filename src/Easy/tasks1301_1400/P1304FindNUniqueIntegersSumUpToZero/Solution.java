package Easy.tasks1301_1400.P1304FindNUniqueIntegersSumUpToZero;

import java.util.Arrays;

public class Solution {
    public int[] sumZero(int n) {
        int[] resultInt = new int[n];
        if(n == 1) return new int[] {0};
        int i = 0;
        if(n%2 != 0) {
            resultInt[0] = 0;
            i++;
        }
        int num = 1;
        for(; i < n; i+=2){
            resultInt[i] = num;
            resultInt[i+1] = -num;
            num++;
        }
        return resultInt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sumZero(5)));
        System.out.println(Arrays.toString(solution.sumZero(3)));
        System.out.println(Arrays.toString(solution.sumZero(4)));
        System.out.println(Arrays.toString(solution.sumZero(1)));
    }
}
