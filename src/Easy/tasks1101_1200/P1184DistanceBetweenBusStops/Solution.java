package Easy.tasks1101_1200.P1184DistanceBetweenBusStops;

public class Solution {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwiseSum = 0;
        int wholeDistance = 0;
        for(int i : distance) wholeDistance+=i;
        if(start > destination) {
            start += destination;
            destination = start - destination;
            start = start - destination;
        }
        while (start<destination) clockwiseSum+=distance[start++];

        return Math.min(clockwiseSum, wholeDistance-clockwiseSum);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
        System.out.println(solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        System.out.println(solution.distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
    }

}
