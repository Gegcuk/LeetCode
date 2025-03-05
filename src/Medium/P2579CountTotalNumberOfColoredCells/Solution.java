package Medium.P2579CountTotalNumberOfColoredCells;

class Solution {
    public long coloredCells(int n) {
        long i = (long) n;
        return i * i + (i-1) * (i - 1);
    }
}
