package Medium.P153Sum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        List<List<Integer>> allRes = threeSum(new int[]{-1,0,1,2,-1,-4});

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);

        return IntStream.range(0, nums.length - 2)
                .filter(i -> i == 0 || nums[i] != nums[i - 1])
                .boxed()
                .flatMap(i -> {
                    List<List<Integer>> localResult = new ArrayList<>();
                    for (int lo = i + 1, hi = nums.length - 1; lo < hi;) {
                        int sum = nums[i] + nums[lo] + nums[hi];
                        if (sum == 0) {
                            localResult.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                            while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                            while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                            lo++;
                            hi--;
                        } else if (sum < 0) {
                            lo++;
                        } else {
                            hi--;
                        }
                    }
                    return localResult.stream();
                }).toList();
    }
}

