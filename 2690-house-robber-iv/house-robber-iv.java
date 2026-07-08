class Solution {
    public int minCapability(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int v:nums){
            min=Math.min(min,v);
            max=Math.max(max,v);
        }
        int ans=max;
        while(min<=max){
            int mid=(min+max)/2;
            if(canrob(nums,mid,k)){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
    private boolean canrob(int[] nums, int limit,int k){
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=limit){
                c++;
                i++;
            }
        }
        return c>=k;
    }
}
