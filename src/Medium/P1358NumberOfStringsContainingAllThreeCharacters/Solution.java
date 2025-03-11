package Medium.P1358NumberOfStringsContainingAllThreeCharacters;

public class Solution {

    public int numberOfSubstrings(String s) {

        int[] charCounter = new int[3];
        int counter = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            charCounter[s.charAt(right) - 'a'] ++;

            while (charCounter[0] > 0 && charCounter[1] > 0 &&charCounter[2] > 0){
                counter += s.length()-right;
                charCounter[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numberOfSubstrings("abc");
    }

}
