package Easy.P205IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(sArray[i])){
                if(tArray[i] != sMap.get(sArray[i])) return false;
            } else {
                if(sMap.containsValue(tArray[i])) return false;
                sMap.put(sArray[i], tArray[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("paper", "title"));
        System.out.println(solution.isIsomorphic("bbbaaabad", "aaabbbbaa"));
        System.out.println(solution.isIsomorphic("badc", "baba"));
    }
}
