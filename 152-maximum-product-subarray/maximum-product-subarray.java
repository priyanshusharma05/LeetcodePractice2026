class Solution {
    public int maxProduct(int[] nums) {
        int pref=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pref*=nums[i];
            suff*=nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(pref,suff));

            if(pref==0)pref=1;
            if(suff==0)suff=1;
        }
        return ans;
    }
}