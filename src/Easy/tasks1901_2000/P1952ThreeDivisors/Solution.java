package Easy.tasks1901_2000.P1952ThreeDivisors;

public class Solution {
    public boolean isThree(int n) {
        if (n == 2) return false;
        int counter = 2;
        if(n % 2 == 0) counter++;
        if(n % 3 == 0) counter++;
        for(int i = 4; i <= n/2; i++){
            if(n % i == 0) counter++;
            if(counter >= 4) return false;
        }
        return counter == 3;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isThree(14));
    }
}
