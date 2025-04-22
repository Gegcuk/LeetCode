package Easy.tasks201_300.P263UglyNumber;

public class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        while(n % 2 == 0) n /= 2;
        while(n % 3 == 0) n /= 3;
        while(n % 5 == 0) n /= 5;
        return n <= 5;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(6));
        System.out.println(solution.isUgly(1));
        System.out.println(solution.isUgly(14));
        System.out.println(solution.isUgly(5));
        System.out.println(solution.isUgly(1000));
    }


}
