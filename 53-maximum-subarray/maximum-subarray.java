class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int v:nums){
            sum+=v;
            maxsum=Math.max(maxsum,sum);
            if(sum<0)sum=0;
        }
        return maxsum;
    }
}