package Easy.P3360StoneRemovalGame;

import jdk.swing.interop.SwingInterOpUtils;

public class Solution {
    public boolean canAliceWin(int n) {
        int move = 10;
        while(n > 0){
            System.out.println(("N = " + n + " move = " + move));
            if(n - move < 0){
                return move % 2 != 0;
            } else if (n - move == 0) {
                return  move % 2 == 0;
            }
            n -= move;
            move--;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canAliceWin(1));
        System.out.println(solution.canAliceWin(12));
        System.out.println(solution.canAliceWin(10));
    }
}
