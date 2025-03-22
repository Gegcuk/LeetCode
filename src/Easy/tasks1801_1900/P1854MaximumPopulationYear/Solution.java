package Easy.tasks1801_1900.P1854MaximumPopulationYear;

public class Solution {

    public int maximumPopulation(int[][] logs) {
        int[] counter = new int[2051];
        for(int person = 0; person < logs.length; person++){
            int startIndex = logs[person][0];
            int endIndex = logs[person][1];
            while (startIndex < endIndex){
                counter[startIndex++]++;
            }
        }
        int maxPopulation = 0;
        int year = 0;
        for(int i = 1950; i < 2051; i++){
            if(counter[i] > maxPopulation) {
                maxPopulation = counter[i];
                year = i;
            }
        }

        return year;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}}));
    }

}
