package Easy.tasks1701_1800.P1710MaximumUnitsOnATruck;

import java.util.*;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int result = 0;
        int loaded = 0;

        for (int[] nextbox : boxTypes) {
            while (nextbox[0] != 0 && loaded < truckSize) {
                result += nextbox[1];
                nextbox[0]--;
                loaded++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] testInt = {{5,10},{2,5},{4,7},{3,9}};
        System.out.println((solution.maximumUnits(testInt, 10)));
    }
}
