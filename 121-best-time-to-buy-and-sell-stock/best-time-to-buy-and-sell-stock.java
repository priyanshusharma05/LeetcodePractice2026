class Solution {
    public int maxProfit(int[] prices) {
        int[] preMin=new int[prices.length];
        preMin[0]=prices[0];
        for(int i=1;i<prices.length;i++){
            preMin[i]=Math.min(preMin[i-1],prices[i-1]);
        }
        int maxprof=Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            maxprof=Math.max(maxprof,(prices[i]-preMin[i]));
        }
        return maxprof;
    }
}