package Easy.tasks901_1000.P997FindTheTownJudge;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public int findJudge(int n, int[][] trust) {
        if(n == 1) return -1;
        HashMap<Integer, Integer[]> trustMap = new HashMap<>();

        for (int[] value : trust) {
            trustMap.putIfAbsent(value[0], new Integer[]{0, 0});
            trustMap.putIfAbsent(value[1], new Integer[]{0, 0});
        }

        for (int[] ints : trust) {
            trustMap.get(ints[0])[0]++;
            trustMap.get(ints[1])[1]++;
        }
        trustMap.values().forEach(c -> System.out.println(c[0] + " " + c[1]));
        for(Integer i: trustMap.keySet()){
            if(trustMap.get(i)[0] == 0 && trustMap.get(i)[1] == n - 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findJudge(2, new int[][]{{1, 2}}));
        System.out.println(solution.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        System.out.println(solution.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }

}
