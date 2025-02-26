package Medium.P29DivideTwoIntegers;

class Solution {
    public int divide(int dividend, int divisor) {
        long quotientAccumulator = 0;

        if (divisor == 1) return dividend;
        long resultSign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);

        for (int shiftIndex = 30; shiftIndex >= 0; shiftIndex--) {
            if (absoluteDividend >= (absoluteDivisor << shiftIndex)) {
                quotientAccumulator += (1L << shiftIndex);
                absoluteDividend -= (absoluteDivisor << shiftIndex);
            }
        }

        return (int) (quotientAccumulator * resultSign);
    }
}
