package Easy.P121BestTimeToBuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy) buy = prices[i];
            else if (prices[i] - buy > profit) profit = prices[i] - buy;
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = solution.maxProfit(prices1);
        System.out.println("Max Profit for prices1: " + profit1);  // Expected output: 5

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int profit2 = solution.maxProfit(prices2);
        System.out.println("Max Profit for prices2: " + profit2);  // Expected output: 0

        // Test case 3
        int[] prices3 = {1, 2, 3, 4, 5};
        int profit3 = solution.maxProfit(prices3);
        System.out.println("Max Profit for prices3: " + profit3);  // Expected output: 4
    }
}
