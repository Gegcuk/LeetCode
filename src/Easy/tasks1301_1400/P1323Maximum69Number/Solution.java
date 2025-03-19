package Easy.tasks1301_1400.P1323Maximum69Number;

public class Solution {
    public int maximum69Number (int num) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);

        for(int i = 0; i < stringBuilder.length(); i++){
            if(stringBuilder.charAt(i) == '6'){
                stringBuilder.setCharAt(i, '9');
                break;
            }
        }

        return Integer.parseInt(stringBuilder.toString());

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maximum69Number(9669));
    }
}
