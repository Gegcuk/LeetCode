package Medium.tasks1001_1100.P1017ConvertToBase2;

public class Solution {
    public String baseNeg2(int n) {
        if(n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while(n != 0) {
            int remainder = n % (-2);
            n /= (-2);

            if(remainder < 0) {
                remainder += 2;
                n+=1;
            }
            sb.append(remainder);
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.baseNeg2(2));
        solution.baseNeg2(3);
        solution.baseNeg2(4);
    }
}
