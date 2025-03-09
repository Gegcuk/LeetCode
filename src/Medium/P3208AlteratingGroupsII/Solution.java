package Medium.P3208AlteratingGroupsII;

import java.util.Arrays;

public class Solution {

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] fullArray = new int[colors.length + (k - 1)];
        int fullArrayIndex = 0;

        for (int color : colors) fullArray[fullArrayIndex++] = color;

        for (int i = 0; i < k - 1; i++) fullArray[fullArrayIndex++] = colors[i];


        int counter = 0;
        int left = 0;

        for (int right = 0; right < fullArray.length; right++) {
            if (right > 0 && fullArray[right] == fullArray[right - 1]) left = right;
            if(right - left + 1 >= k) counter++;
        }

        return counter;
    }



    public static void main(String[] args) {

        int[] arrayToTest = new int[]{0, 1, 0, 1, 0};

        Solution solution = new Solution();
        solution.numberOfAlternatingGroups(arrayToTest, 3);
    }


}
