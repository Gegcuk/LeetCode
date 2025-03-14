package Easy.P1684CountTheNumberOfConsistentStrings;

import java.util.Arrays;

public class Solution {

    public int countConsistentStrings(String allowed, String[] words) {
        long counter = Arrays.stream(words).filter(word -> {
            for(int i = 0; i < word.length(); i++){
                if(!allowed.contains(String.valueOf(word.charAt(i)))){
                    return false;
                }
            }
            return true;
        }).count();

        return (int) counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(solution.countConsistentStrings("exdohslrwipnt", new String[]{"xrwlstne","rs","ioetdll","lwi","r","pieonois","r","xtp","stia","gicfuvmnr","hdntpxse","sodxws","v","hstirooon","d"}));
    }

}
