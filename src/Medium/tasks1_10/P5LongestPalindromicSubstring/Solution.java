package Medium.tasks1_10.P5LongestPalindromicSubstring;

public class Solution {
    public String longestPalindromeBruteForce(String s) {
        int wordLength = s.length();
        int arrayLength = s.length()*(1 + s.length())/2;
        System.out.println("Array Length: " + arrayLength);
        String[] variantsArray = new String[arrayLength];
        int index = 0;
        for(int i = 0; i < wordLength; i++){
            for(int j = i; j < wordLength; j++){
                variantsArray[index++] = s.substring(i, j+1);
            }
        }
        String longestPalindrome = "";
        for(String string : variantsArray){
            if(isPalindrome(string) && string.length() > longestPalindrome.length()) longestPalindrome = string;
        }
        return longestPalindrome;
    }

    public String longestPalindromeExpandAroundCenter(String s){
        String longestPalindrome = "";




        return longestPalindrome;
    }

    boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "a";
        String test4 = "restsf";
        String test5 = "racecar";


        System.out.println("\n\n============Brute Force==========\n\n");
        // Print results
        System.out.println("Test case 1: " + solution.longestPalindromeBruteForce(test1)); // Expected: "bab" or "aba"
        System.out.println("Test case 2: " + solution.longestPalindromeBruteForce(test2)); // Expected: "bb"
        System.out.println("Test case 3: " + solution.longestPalindromeBruteForce(test3)); // Expected: "a"
        System.out.println("Test case 4: " + solution.longestPalindromeBruteForce(test4)); // Expected: "a" or "c"
        System.out.println("Test case 5: " + solution.longestPalindromeBruteForce(test5)); // Expected: "racecar"

        System.out.println("\n\n============Around Center==========\n\n");
    }


}
