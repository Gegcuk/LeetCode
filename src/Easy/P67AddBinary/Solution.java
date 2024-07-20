package Easy.P67AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder resultString = new StringBuilder();
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        int carry = 0;

        while(indexA >= 0 || indexB >= 0 || carry == 1){
            if(indexA >= 0)
                carry += a.charAt(indexA--) - '0';
            if(indexB >= 0)
                carry += b.charAt(indexB--) - '0';
            resultString.append(carry % 2);
            carry /= 2;
        }
        return resultString.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String a1 = "1010";
        String b1 = "1011";
        String result1 = solution.addBinary(a1, b1);
        System.out.println("Result for adding " + a1 + " and " + b1 + " is: " + result1);

        String a2 = "1101";
        String b2 = "111";
        String result2 = solution.addBinary(a2, b2);
        System.out.println("Result for adding " + a2 + " and " + b2 + " is: " + result2);

        String a3 = "0";
        String b3 = "0";
        String result3 = solution.addBinary(a3, b3);
        System.out.println("Result for adding " + a3 + " and " + b3 + " is: " + result3);

        String a4 = "1";
        String b4 = "111";
        String result4 = solution.addBinary(a4, b4);
        System.out.println("Result for adding " + a4 + " and " + b4 + " is: " + result4);
    }
}
