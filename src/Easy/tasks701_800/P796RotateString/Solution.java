package Easy.tasks701_800.P796RotateString;

public class Solution {

    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        char[] charArray = new char[s.length() * 2];
        char[] goalArray = goal.toCharArray();
        for(int i = 0; i < s.length(); i++){
            charArray[i] = s.charAt(i);
        }
        int start = 0;
        int end = s.length()-1;
        for(int i = 0; i < charArray.length; i++){
            if(compareArrays(charArray, goalArray, start, end)){
                return true;
            }
            else {
                if(end == charArray.length-1) return false;
                charArray[end+1] = charArray[start++];
                end++;
            }
        }

        return true;
    }

    static private boolean compareArrays(char[] sArray, char[] goalArray, int start, int end){
        int i = 0;
        while(start <= end){
            if(sArray[start++] != goalArray[i++]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rotateString("abcde", "abced"));
        System.out.println(solution.rotateString("abcde", "cdeab"));
    }

}
