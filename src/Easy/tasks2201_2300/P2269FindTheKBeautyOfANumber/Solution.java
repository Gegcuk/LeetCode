package Easy.tasks2201_2300.P2269FindTheKBeautyOfANumber;

public class Solution {

    public int divisorSubstrings(int num, int k) {

        String numbetString = String.valueOf(num);
        int start = 0, end = start + k;
        int counter = 0;
        while (end <= numbetString.length()){
            int curSubInt = Integer.parseInt(numbetString.substring(start, end));
            if(curSubInt == 0) {
                start++;
                end++;
                continue;
            }
            if(num % curSubInt == 0) counter++;
            start++;
            end++;
        }

        return counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.divisorSubstrings(430043, 2);
    }
}