package Medium.tasks3101_3200.P3169CountDaysWithoutMeetings;

import java.util.*;

public class Solution {

    public int countDays(int days, int[][] meetings) {

        if(meetings.length == 1) {
            return days - (meetings[0][1] - meetings[0][0]) - 1;
        }
        Arrays.sort(meetings, Comparator.comparing(meeting->meeting[0]));
        int counter = 0;

        int start = meetings[0][0];
        int end = meetings[0][1];
        for (int[] currentMeeting : meetings) {
            if (currentMeeting[0] > end) {
                counter += end - start + 1;
                start = currentMeeting[0];
                end = currentMeeting[1];
            } else if (currentMeeting[1] > end) {
                end = currentMeeting[1];
            }
        }

        counter += end - start + 1;

        return days - counter;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countDays(10, new int[][]{{5, 7}, {1, 3}, {9, 10}}));
        System.out.println(solution.countDays(5, new int[][]{{2, 4}, {1, 3}}));
        System.out.println(solution.countDays(6, new int[][]{{1, 6}}));
    }
}
