class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0]; // Track the lowest buying price seen so far
        int maxProfit = 0;        // Track the maximum profit possible

        for (int i = 1; i < prices.length; i++) {
            // If the current price is lower than our minimum, update our minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Otherwise, check if selling today yields a better profit
                int currentProfit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }

        return maxProfit;
    }
}