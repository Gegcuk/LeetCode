package Easy.tasks1301_1400.P1346CheckIfNandItsDoubleExist;

import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> arrSet = new HashSet<>();
        for(int num : arr){
            if(arrSet.contains(num*2) || (num % 2 == 0 && arrSet.contains(num/2))) return true;
            arrSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test1 = {10, 2, 5, 3};
        int[] test2 = {7, 1, 14, 11};
        int[] test3 = {3, 1, 7, 11};
        int[] test4 = {-20,8,-6,-14,0,-19,14,4}; // Test with negative and zero

        System.out.println("Test 1: " + solution.checkIfExist(test1)); // Expected: true
        System.out.println("Test 2: " + solution.checkIfExist(test2)); // Expected: true
        System.out.println("Test 3: " + solution.checkIfExist(test3)); // Expected: false
        System.out.println("Test 4: " + solution.checkIfExist(test4)); // Expected: false
    }
}
