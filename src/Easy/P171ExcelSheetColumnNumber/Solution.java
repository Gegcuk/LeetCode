package Easy.P171ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(Character c : columnTitle.toCharArray())
        {
            sum *= 26;
            sum += ((int) c - (int) 'A' + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test cases
        String test1 = "A";   // Expected output: 1
        String test2 = "B";   // Expected output: 2
        String test3 = "Z";   // Expected output: 26
        String test4 = "AA";  // Expected output: 27
        String test5 = "AB";  // Expected output: 28
        String test6 = "ZY";  // Expected output: 701

        // Running the function with test cases and printing the results
        System.out.println("Column Title: " + test1 + " => Column Number: " + solution.titleToNumber(test1));
        System.out.println("Column Title: " + test2 + " => Column Number: " + solution.titleToNumber(test2));
        System.out.println("Column Title: " + test3 + " => Column Number: " + solution.titleToNumber(test3));
        System.out.println("Column Title: " + test4 + " => Column Number: " + solution.titleToNumber(test4));
        System.out.println("Column Title: " + test5 + " => Column Number: " + solution.titleToNumber(test5));
        System.out.println("Column Title: " + test6 + " => Column Number: " + solution.titleToNumber(test6));
    }
}
