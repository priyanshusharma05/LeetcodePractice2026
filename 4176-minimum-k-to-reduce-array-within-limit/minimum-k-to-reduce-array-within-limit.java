class Solution {
    public int minimumK(int[] nums) {
        int lo=1;
        int hi=100000;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isreduced(nums, mid)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
    private boolean isreduced(int[] arr ,int k){
        long ops = 0;
        for(int v : arr) {
            ops += (v + k - 1)/k;
            if(ops > (long) k * k) return false;
        }
        return true;
    }
}