package Medium.P2523ClosestPrimeNumbersInRange;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] closestPrimes(int left, int right) {
        List<Integer> list_of_primes = new ArrayList<>();
        if(left == 1) left++;
        for(int i = left; i <= right; i++){
            if(isPrimeNumber(i)){
                list_of_primes.add(i);
                left = i+1;
                break;
            }
        }
        int index = 1;
        while(left <= right){
            if(isPrimeNumber(left)){
                list_of_primes.add(index, left - list_of_primes.get(index-1));
                list_of_primes.add(left);
                index += 2;
            }
            left++;
        }
        System.out.println(list_of_primes);
        if(list_of_primes.size() <= 1) return new int[]{-1, -1};
        int minimum = list_of_primes.get(list_of_primes.size() - 2);
        int minimum_index = list_of_primes.size() - 2;
        for(int i = list_of_primes.size() - 2; i >= 0; i-=2){
            if(list_of_primes.get(i) <= minimum) {
                minimum_index = i;
                minimum = list_of_primes.get(i);
            }
        }
        return new int[]{list_of_primes.get(minimum_index-1), list_of_primes.get(minimum_index + 1)};
    }

    private static boolean isPrimeNumber(int number){

        for(int i = 2; i*i <= number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.closestPrimes(1, 10000);
    }
}
