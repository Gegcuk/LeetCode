package Medium.P49GroupAnagram;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = solution.groupAnagrams(test1);
        System.out.println("Test 1 Result: " + result1);

        String[] test2 = {"", ""};
        List<List<String>> result2 = solution.groupAnagrams(test2);
        System.out.println("Test 2 Result: " + result2);

        String[] test3 = {"a"};
        List<List<String>> result3 = solution.groupAnagrams(test3);
        System.out.println("Test 3 Result: " + result3);
    }
}
