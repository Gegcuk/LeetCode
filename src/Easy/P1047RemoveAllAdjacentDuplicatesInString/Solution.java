package Easy.P1047RemoveAllAdjacentDuplicatesInString;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {

    public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        Stack<Character> characterStack = new Stack<>();
        characterStack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char curChar = s.charAt(i);
            if(!characterStack.isEmpty() && characterStack.getLast() == curChar) {
                characterStack.pop();
            } else {
                characterStack.push(curChar);
            }

        }
        StringBuilder resultSb = new StringBuilder();
        while(!characterStack.isEmpty()){
            resultSb.append(characterStack.pop());
        }
        return resultSb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates("abbaca"));
        System.out.println(solution.removeDuplicates("azxxzy"));
        System.out.println(solution.removeDuplicates("azz"));
        System.out.println(solution.removeDuplicates("aaz"));
        System.out.println(solution.removeDuplicates("zz"));
        System.out.println(solution.removeDuplicates("za"));
        System.out.println(solution.removeDuplicates("aaaaaaaa"));
//        System.out.println("azz");
    }

    @Test
    public void removeDuplicatesTest(){
        assertEquals("ca", removeDuplicates("abbaca"));
        assertEquals("ay", removeDuplicates("azxxzy"));
        assertEquals("a", removeDuplicates("azz"));
        assertEquals("z", removeDuplicates("aaz"));
        assertEquals("", removeDuplicates("zz"));
        assertEquals("za", removeDuplicates("za"));
        assertEquals("", removeDuplicates("aaaaaaaa"));
    }


}
