package Medium.P1081SmallestSubsequenceOfDistinctCharacters;

import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {


        int[] freqArray = new int[26];
        boolean[] visitedArray = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            freqArray[c-'a']++;
        }

        for(Character c : s.toCharArray()){
            freqArray[c - 'a']--;
            if(visitedArray[c-'a']) continue;
            while (!stack.isEmpty() && stack.peek() > c && freqArray[stack.peek() - 'a'] > 0){
                visitedArray[stack.pop()-'a'] = false;
            }
            stack.push(c);
            visitedArray[c - 'a'] = true;
        }

        StringBuilder resultStringSb = new StringBuilder();
        while (!stack.isEmpty()){
            resultStringSb.append(stack.pop());
        }


        return resultStringSb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.smallestSubsequence("bcabc"));
        System.out.println(solution.smallestSubsequence("cbacdcbc"));


    }
}
