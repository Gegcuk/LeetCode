package Easy.tasks3201_3300.P3210FindTheEncryptedString;

public class Solution {
    public String getEncryptedString(String s, int k) {
        int shift = k % s.length();
        char[] doubleString = (s+s).toCharArray();
        StringBuilder resultStringBuilder = new StringBuilder();
        for(int i = 0; i < s.length();i++){
            resultStringBuilder.append(doubleString[i + shift]);
        }
        return resultStringBuilder.toString();
    }

    public String getEncryptedString2(String s, int k) {
        int shift = k % s.length();

        return s.substring(shift) + s.substring(0, shift);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getEncryptedString("dart", 3));
        System.out.println(solution.getEncryptedString2("dart", 3));
    }
}
