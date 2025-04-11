package Easy.tasks1801_1900.P1876SubstringOfSizeThreeWithDistinctCharacters;

public class Solution {

    public int countGoodSubstrings(String s) {
        int counter = 0;
        if(s.length() < 3) return 0;
        char charOne = s.charAt(0), charTwo = s.charAt(1), charThree = s.charAt(2);
        for(int i = 3; i < s.length();i++ ){
            if(charOne != charTwo && charOne != charThree && charTwo != charThree) counter++;
            charOne = charTwo;
            charTwo = charThree;
            charThree = s.charAt(i);
        }
        if(charOne != charTwo && charOne != charThree && charTwo != charThree) counter++;
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countGoodSubstrings("aababcabc"));
    }

}
