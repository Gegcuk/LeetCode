package Easy.P69SqrtX;

public class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0) return x;

        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid == x / mid)
                return mid;
            else if(x / mid > mid)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int x1 = 4;
        int result1 = solution.mySqrt(x1);
        System.out.println("Square root of " + x1 + " is: " + result1);

        int x2 = 8;
        int result2 = solution.mySqrt(x2);
        System.out.println("Square root of " + x2 + " is: " + result2);

        int x3 = 2147395599;
        int result3 = solution.mySqrt(x3);
        System.out.println("Square root of " + x3 + " is: " + result3);

        int x4 = 1;
        int result4 = solution.mySqrt(x4);
        System.out.println("Square root of " + x4 + " is: " + result4);

        int x5 = 0;
        int result5 = solution.mySqrt(x5);
        System.out.println("Square root of " + x5 + " is: " + result5);
    }
}
