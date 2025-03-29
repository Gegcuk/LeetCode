package Medium.tasks1301_1400.P1375NumberOfTimesBinaryStringIsPrefixAligned;

public class Solution {

//    public int numTimesAllBlue(int[] flips) {
//        int counter = 0;
//        StringBuilder sb = new StringBuilder();
//        sb.append("0".repeat(flips.length));
//        for(int i = 0; i < sb.length(); i++){
//            sb.setCharAt(flips[i]-1, '1');
//            if(isPrefixAligned(sb.toString())) counter++;
//        }
//        return counter;
//
//    }
//
//    private boolean isPrefixAligned(String s){
//        int i = 0;
//        if(s.charAt(0) == '0') return false;
//        while (i < s.length()){
//            if(s.charAt(i) == '1') i++;
//            else break;
//        }
//        while(i < s.length()){
//            if(s.charAt(i) != '0') return false;
//            i++;
//        }
//        return true;
//    }

        public int numTimesAllBlue(int[] flips) {
            int right = 0, counter = 0;
            for (int i = 0; i < flips.length; i++) {
                right = Math.max(right, flips[i]);
                if(right == i + 1) counter++;
            }
            return counter;
        }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.numTimesAllBlue(new int[]{3, 2, 4, 1, 5}));
    }

}
