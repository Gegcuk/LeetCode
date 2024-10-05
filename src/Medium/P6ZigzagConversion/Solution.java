package Medium.P6ZigzagConversion;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || numRows >= s.length()) return s;
        int index = 0;
        int direction = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new ArrayList<>();
        }

        for(Character c: s.toCharArray()){
            rows[index].add(c);
            if(index == 0) direction = 1;
            else if(index == numRows - 1) direction = -1;
            index += direction;
        }

        StringBuilder result = new StringBuilder();
        for(List<Character> row: rows){
            for(char c: row) result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        String input1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String result1 = solution.convert(input1, numRows1);
        System.out.println("Input: " + input1 + ", numRows: " + numRows1);
        System.out.println("Output: " + result1); // Expected: "PAHNAPLSIIGYIR"

        // Test Case 2
        String input2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String result2 = solution.convert(input2, numRows2);
        System.out.println("Input: " + input2 + ", numRows: " + numRows2);
        System.out.println("Output: " + result2); // Expected: "PINALSIGYAHRPI"

        // Test Case 3
        String input3 = "A";
        int numRows3 = 1;
        String result3 = solution.convert(input3, numRows3);
        System.out.println("Input: " + input3 + ", numRows: " + numRows3);
        System.out.println("Output: " + result3); // Expected: "A"

        // Test Case 4
        String input4 = "HELLO";
        int numRows4 = 2;
        String result4 = solution.convert(input4, numRows4);
        System.out.println("Input: " + input4 + ", numRows: " + numRows4);
        System.out.println("Output: " + result4); // Expected: "HLOEL"
    }
}
