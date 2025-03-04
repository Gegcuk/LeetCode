package Medium.P1310XorQueriesOfSubarray;

public class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {

        int start, finish;
        int[] resultArray = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            start = queries[i][0];
            finish = queries[i][1];
            resultArray[i] = xorOfSubArray(arr, start, finish);
        }

        return resultArray;
    }

    private int xorOfSubArray(int[] arr, int start, int finish) {
        int result = 0;
        while(start <= finish){
            result = result ^ arr[start++];
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] testQueries = {{0,1}, {1, 2}, {0, 3}, {3, 3}};
        int[] testArray = {1, 3, 4, 8};

        solution.xorQueries(testArray, testQueries);
    }

}
