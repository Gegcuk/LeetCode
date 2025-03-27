package Easy.tasks1801_1900.P1832CheckIfTheSentenceIsPangram;

public class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] letterExistsArray = new boolean[26];
        int curIndex = 0;
        int counter = 0;
        for(int i = 0; i < sentence.length(); i++){
            curIndex = sentence.charAt(i) - 'a';
            if(!letterExistsArray[curIndex]) {
                letterExistsArray[curIndex] = true;
                counter++;
            }
            if (counter == 26) return true;
        }
        return false;
    }
}
