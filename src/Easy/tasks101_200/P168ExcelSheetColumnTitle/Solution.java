package Easy.tasks101_200.P168ExcelSheetColumnTitle;

public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder resultString = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char c = (char) ('A' + columnNumber%26);
            resultString.insert(0, c);
            columnNumber/=26;
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testCases = {1, 28, 701, 2147483647};

        // Loop through test cases and print the results
        for (int testCase : testCases) {
            String result = solution.convertToTitle(testCase);
            System.out.println("Column Number: " + testCase + " -> Column Title: " + result);
        }
    }
}
