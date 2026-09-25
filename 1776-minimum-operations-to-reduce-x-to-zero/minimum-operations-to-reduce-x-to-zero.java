class Solution {
    public int minOperations(int[] nums, int x) {
         int max=-1;
         int left=0;
         int ri=0;
         long total=0;
         for(int v:nums)total+=v;
         long sum=0;
         while(ri<nums.length){
            sum+=nums[ri];
            while(left<nums.length && sum>(total-x)){
                sum-=nums[left];
                left++;
                if(sum==(total-x)){
                    max=Math.max(max,ri-left+1);
                }
            }
            if(sum==total-x){
                    max=Math.max(max,ri-left+1);
                }
            ri++;
         }
         if (max==-1)return -1;
         return nums.length-max;
    }
}