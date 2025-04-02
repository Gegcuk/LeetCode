package Easy.tasks1701_1800.P1784CheckIfBinaryHasAtMostOneSegmentOfOnes;

public class Solution {

    public boolean checkOnesSegment(String s) {
        boolean nowZeroes = false;
        if(s.equals("1")) return true;
        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i) == '0') nowZeroes = true;
            if(nowZeroes && s.charAt(i) == '1') return false;
        }
        return true;
    }

}
