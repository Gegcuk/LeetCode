package Medium.P17LetterCompinationsOfAPhoneNumber;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> resultList = new ArrayList<>();
        if(digits.isEmpty()) return resultList;

        Map<Character, String> characterMap = new HashMap<>(){
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };

        addSymbols(digits, 0, new StringBuilder(), resultList, characterMap);

        return resultList;
    }

    private void addSymbols(String digits, int i, StringBuilder subList, List<String> resultList, Map<Character, String> characterMap) {
        if(i == digits.length()){
            resultList.add(subList.toString());
            return;
        }

        String letters = characterMap.get(digits.charAt(i));
        for(char c: letters.toCharArray()){
            subList.append(c);
            addSymbols(digits, i+1, subList, resultList, characterMap);
            subList.deleteCharAt(subList.length()-1);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.letterCombinations("27763"));
        System.out.println(solution.letterCombinations(""));
    }
}
