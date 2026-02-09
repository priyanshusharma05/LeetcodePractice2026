class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int v:nums)sum+=v;
        int ans=0;
        for(int i=0;i<n-1;i++){
            double avg= (sum-nums[i])/(n-i-1);
            if(nums[i]>avg)ans++;
            sum=sum-nums[i];
        }
        return ans;
    }
}