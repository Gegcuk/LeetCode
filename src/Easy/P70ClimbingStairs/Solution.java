package Easy.P70ClimbingStairs;

public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int currentNumber = 1;
        int previousNumber = 1;
        for(int i = 1; i < n; i++){
            currentNumber = currentNumber + previousNumber;
            previousNumber = currentNumber - previousNumber;
        }
        return currentNumber;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(1));
        System.out.println(solution.climbStairs(2));
        System.out.println(solution.climbStairs(3));
        System.out.println(solution.climbStairs(4));
        System.out.println(solution.climbStairs(5));
    }
}
