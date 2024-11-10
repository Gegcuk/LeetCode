package Medium;

public class P172FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int numberOfZeroes = 0;
        while (n != 0){
            n /= 5;
            numberOfZeroes += n;
        }
        return numberOfZeroes;
    }

    public static void main(String[] args) {
        P172FactorialTrailingZeroes solution = new P172FactorialTrailingZeroes();

        // Test cases
        int[] testCases = {0, 5, 10, 25, 50, 100, 200};

        for (int n : testCases) {
            System.out.println("Trailing zeroes in " + n + "! = " + solution.trailingZeroes(n));
        }
    }

}
