package Medium.P11ContainerWithMostWater;

class Solution {
    public int maxArea(int[] height) {
        int rightPointer = height.length - 1;
        int leftPointer = 0;
        int maxArea = 0;
        while (leftPointer < rightPointer){
            int length = rightPointer - leftPointer;
//            int area = Math.min(height[leftPointer], height[rightPointer]) * length;
//            maxArea = Math.max(area, maxArea);
            int area = height[leftPointer] < height[rightPointer] ? height[leftPointer] * length : height[rightPointer] * length;
            maxArea = maxArea > area ? maxArea : area;
            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            } else{
                rightPointer--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] heights2 = {1, 1};
        int[] heights3 = {4, 3, 2, 1, 4};
        int[] heights4 = {1, 2, 1};

        // Running the tests
        System.out.println("Max Area for heights1: " + solution.maxArea(heights1)); // Expected: 49
        System.out.println("Max Area for heights2: " + solution.maxArea(heights2)); // Expected: 1
        System.out.println("Max Area for heights3: " + solution.maxArea(heights3)); // Expected: 16
        System.out.println("Max Area for heights4: " + solution.maxArea(heights4)); // Expected: 2
    }
}
