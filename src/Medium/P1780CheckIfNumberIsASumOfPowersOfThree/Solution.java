package Medium.P1780CheckIfNumberIsASumOfPowersOfThree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n > 0){
            if(n % 3 == 2) return false;
            n /= 3;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkPowersOfThree(91));
    }
}
