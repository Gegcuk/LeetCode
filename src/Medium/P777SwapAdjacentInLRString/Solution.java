package Medium.P777SwapAdjacentInLRString;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean canTransform(String start, String result) {
        if (start.length() != result.length()) return false;

        int n = start.length();
        int i = 0, j = 0;

        while (i < n || j < n) {
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }
            while (j < n && result.charAt(j) == 'X') {
                j++;
            }

            if (i == n && j == n) break;
            if (i == n || j == n) return false;

            if (start.charAt(i) != result.charAt(j)) return false;

            if (start.charAt(i) == 'L' && i < j) return false;
            if (start.charAt(i) == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canTransform("RXXLRXRXL","XRLXXRRLX" ));
    }
}
