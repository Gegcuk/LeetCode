package Easy.P9PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        String strNumber = String.valueOf(x);
        char[] chars= strNumber.toCharArray();
        for(int i = 0; i < chars.length/2; i++){
            int j = chars.length - i - 1;
            if (chars[i] != chars[j]){
                    return false;
            }
        }
        return true;
    }

    public static void Test(){
        System.out.println(new Solution().isPalindrome(121));
        System.out.println(new Solution().isPalindrome(-121));
        System.out.println(new Solution().isPalindrome(10));
        System.out.println(new Solution().isPalindrome(0));
    }

    public static void main(String[] args) {
        Test();
    }
}