package Easy.P125ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String s1 = "0P";
        boolean result1 = solution.isPalindrome(s1);
        System.out.println("Is \"" + s1 + "\" a palindrome? " + result1);  // Expected output: true

        // Test case 2
        String s2 = "race a car";
        boolean result2 = solution.isPalindrome(s2);
        System.out.println("Is \"" + s2 + "\" a palindrome? " + result2);  // Expected output: false

        // Test case 3
        String s3 = " ";
        boolean result3 = solution.isPalindrome(s3);
        System.out.println("Is \"" + s3 + "\" a palindrome? " + result3);  // Expected output: true
    }
}
