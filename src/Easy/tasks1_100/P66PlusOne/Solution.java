package Easy.tasks1_100.P66PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result for [1, 2, 3] is: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result for [4, 3, 2, 1] is: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] digits3 = {9, 9, 9};
        int[] result3 = solution.plusOne(digits3);
        System.out.print("Result for [9, 9, 9] is: ");
        for (int digit : result3) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] digits4 = {0};
        int[] result4 = solution.plusOne(digits4);
        System.out.print("Result for [0] is: ");
        for (int digit : result4) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}