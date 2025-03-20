package Medium.tasks2001_2100.P2038RemoveColoredPiecesifBothNeighborsAreTheSameColor;

public class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length()<3) return false;
        char left, mid, right;
        char[] colorsArray = colors.toCharArray();

        int alice = 0, bob = 0;
        for(int i = 1; i < colors.length()-1; i++){
            left = colorsArray[i-1];
            mid = colorsArray[i];
            right = colorsArray[i+1];

            if(mid + left + right == 195) alice++;
            if(mid + left + right == 198) bob++;
        }
        return alice > bob;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.winnerOfGame("AAABABB"));
        System.out.println(solution.winnerOfGame("AA"));
        System.out.println(solution.winnerOfGame("ABBBBBBAAA"));
    }
}