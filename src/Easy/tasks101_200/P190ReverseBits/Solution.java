package Easy.tasks101_200.P190ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        n = ((n & 0xffff0000) >>> 16 ) | ((n & 0x0000ffff) << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);

        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int input = 43261596; // Example input
        int reversed = solution.reverseBits(input);

        System.out.println("Input (in binary):  " + Integer.toBinaryString(input));
        System.out.println("Reversed (in binary): " + Integer.toBinaryString(reversed));
        System.out.println("Reversed (as integer): " + reversed);
    }
}

