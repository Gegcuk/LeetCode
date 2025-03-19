package Easy.tasks401_500.P482LicenseKeyFormatting;

public class Solution {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        s = s.replaceAll("-", "").toUpperCase();
        int counter = 0;
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
            counter++;
            if(counter==k && i != 0){
                sb.append('-');
                counter=0;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.licenseKeyFormatting("--a-a-a-a--", 2));
    }
}
