package Easy.tasks2801_2900.P2810FaultyKeyboard;

public class Solution {
    public String finalString(String s) {
        StringBuilder resultSb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i') resultSb.reverse();
            else resultSb.append(s.charAt(i));
        }

        return resultSb.toString();
    }
}
