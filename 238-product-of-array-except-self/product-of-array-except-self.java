class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] suff=new int[n];
        suff[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        int pref=1;
        int[] re=new int[n];
        for(int i=0;i<n;i++){
            re[i]=pref*suff[i];
            pref*=nums[i];
        }
        return re;
    }
}