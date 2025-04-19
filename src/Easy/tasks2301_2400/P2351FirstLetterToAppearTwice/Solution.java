package Easy.tasks2301_2400.P2351FirstLetterToAppearTwice;

public class Solution {
    public char repeatedCharacter(String s) {
        boolean[] visitedLetters = new boolean[26];
        char resultChar = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            char curChar = s.charAt(i);
            if(visitedLetters[curChar - 'a']) return curChar;
            else visitedLetters[curChar - 'a'] = true;
        }
        return resultChar;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedCharacter("abcdd"));
    }
}
