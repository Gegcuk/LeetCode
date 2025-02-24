package Medium.P12IntegerToRoman;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultStringBuilder = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            if(num == 0) break;
            while(num >= values[i]){
                resultStringBuilder.append(symbols[i]);
                num -= values[i];
            }
        }
        return resultStringBuilder.toString();
    }


    public static void main(String[] args) {
        System.out.println(intToRoman(5));
        System.out.println(intToRoman(10));
        System.out.println(intToRoman(34));
        System.out.println(intToRoman(36));
        System.out.println(intToRoman(149));
    }
}
