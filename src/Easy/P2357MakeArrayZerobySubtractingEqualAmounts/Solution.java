package Easy.P2357MakeArrayZerobySubtractingEqualAmounts;

import java.util.Arrays;

public class Solution {

    public int minimumOperations(int[] nums) {
        return (int) Arrays.stream(nums).filter(c -> c != 0).distinct().count();
    }

}
