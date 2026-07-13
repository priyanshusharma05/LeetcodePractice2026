class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int minlen=nums.length;
        int left=0;
        int ri=0;
        int sum=0;
        boolean found=false;
        while(ri<nums.length){
            sum+=nums[ri];
            while(sum>=k){
                found=true;
                minlen=Math.min(minlen,ri-left+1);
                sum-=nums[left];
                left++;
                
            }
            ri++;
        }
        if(!found)return 0;
        return minlen;
    }
}