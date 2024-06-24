package LongestCommonPrefix;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            System.out.println(map.keySet());
            for (int j = 0; j < strs[i].length(); j++) {
                System.out.println(map.containsKey(strs[i].charAt(0)));
                System.out.println(strs[i].charAt(0));
                if(map.containsKey(strs[i].charAt(0))){
                    int value = map.get(strs[i].charAt(0)) + 1;
                    System.out.println("Value: " + value);
                    map.put("" + strs[i].charAt(0), value);
                } else {
                    map.put("" + strs[i].charAt(0), 1);
                }

            }
        }

        map.forEach((key, value) -> System.out.println(key + ": " + value));



        return "";
    }

    public static void test(){
        String[] strs = new String[] {"flower","flow","flight"};
        new Solution().longestCommonPrefix(strs);


    }


    public static void main(String[] args) {
        test();
    }

}
