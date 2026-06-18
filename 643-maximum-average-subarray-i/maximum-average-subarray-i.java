class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        if(k>nums.length)return -1;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
       double avg=sum/k;
        for(int i=0;i<nums.length-k;i++){
            sum=sum-nums[i]+nums[i+k];
            avg=Math.max(avg,sum/k);
        }
        return avg;
    }
}