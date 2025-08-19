class Solution {
    public int maxProfit(int[] prices) {
        // This is an optimized solution using a single pass to find the maximum profit.
        // It has O(n) time complexity, which is much better than the brute force approach
        int maxprofit = 0;
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice to the maximum possible value
        for(price: prices){
            if(price < minPrice){ 
                minPrice = price; // Update minPrice if the current price is lower
            }
            else
                maxprofit = Math.max(maxprofit, price - minPrice) // Update maxprofit if the current price minus minPrice is greater
        }
        return maxprofit;

        //this is my brute force solution with O(n^2) time complexity
        // approach 1 bruteforced 
        // It checks every pair of prices to find the maximum profit.
        int maxprofit = 0;
        for(int i=0; i < prices.length; i++){
            for(int j=i+1; j < prices.length; j++){
                //maxprofit = (prices[j]-prices[i] > maxprofit) ? prices[j]-prices[i] : maxprofit;
                maxprofit = Math.max(prices[j] - prices[i], maxprofit);
            }
        }
        return maxprofit;
    }
}