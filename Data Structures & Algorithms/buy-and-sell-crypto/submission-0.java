class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 ;
        int buy = 0 ;
        for(int s = 1;s<prices.length;s++){
            if(prices[s] > prices[buy]){
                max = Math.max(max,prices[s] - prices[buy]);
            }
            else{
                buy = s;
            }
        }
        return max;
    }
}
