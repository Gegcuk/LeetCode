package Easy.tasks601_700.P696CountBinarySubstring;

public class Solution {

    public int countBinarySubstrings(String s) {
        int counter = 0;
        int previousRun = 0;
        int curRun = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1))curRun++;
            else {
                previousRun = curRun;
                curRun = 1;
            }
            if(previousRun >= curRun) counter++;
        }

        return counter;
    }
}
