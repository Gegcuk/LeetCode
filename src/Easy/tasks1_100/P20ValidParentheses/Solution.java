package Easy.tasks1_100.P20ValidParentheses;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheseStack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='[') parentheseStack.push(']');
            else if (c == '(') parentheseStack.push(')');
            else if (c == '{') parentheseStack.push('}');
            else if (parentheseStack.isEmpty() || parentheseStack.pop() != c) return false;
        }
        return parentheseStack.isEmpty();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String test1 = "){";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println("Test case 1: " + solution.isValid(test1)); // Expected: true
        System.out.println("Test case 2: " + solution.isValid(test2)); // Expected: true
        System.out.println("Test case 3: " + solution.isValid(test3)); // Expected: false
        System.out.println("Test case 4: " + solution.isValid(test4)); // Expected: false
        System.out.println("Test case 5: " + solution.isValid(test5)); // Expected: true
    }
}
