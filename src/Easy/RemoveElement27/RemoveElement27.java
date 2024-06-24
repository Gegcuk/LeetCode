package Easy.RemoveElement27;

import java.util.Arrays;

public class RemoveElement27 {


    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement27 solution = new RemoveElement27();

        // Test case 1
        int[] nums1 = {0,1,2,2,3,0,4,2};
        int val1 = 2;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1)));

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + Arrays.toString(Arrays.copyOf(nums2, k2)));
    }

}

