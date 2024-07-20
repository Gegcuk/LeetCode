package Easy.P58LengthofLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int resLength = 0;
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) == ' ') return resLength;
            else resLength++;
        }
        return resLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";
        String test4 = "singleword";
        String test5 = "   ";

        // Running the tests
        System.out.println("Test case 1: \"" + test1 + "\" -> " + solution.lengthOfLastWord(test1)); // Expected: 5
        System.out.println("Test case 2: \"" + test2 + "\" -> " + solution.lengthOfLastWord(test2)); // Expected: 4
        System.out.println("Test case 3: \"" + test3 + "\" -> " + solution.lengthOfLastWord(test3)); // Expected: 6
        System.out.println("Test case 4: \"" + test4 + "\" -> " + solution.lengthOfLastWord(test4)); // Expected: 10
        System.out.println("Test case 5: \"" + test5 + "\" -> " + solution.lengthOfLastWord(test5)); // Expected: 0
    }
}
