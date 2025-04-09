package Easy.tasks1601_1700.P1700NumberOfStudentsUnableToEatLunch;

import java.util.*;

public class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2];
        for(int student: students) counts[student]++;

        int remaining = sandwiches.length;
        for(int sandwich : sandwiches) {
            if(counts[sandwich] == 0) break;
            if(remaining-- == 0) break;
            counts[sandwich]--;
        }


        return remaining;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0 ,1}));
    }
}
