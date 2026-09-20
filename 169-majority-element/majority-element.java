class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cd=0;
        int cnt=0;
        for(int v:nums){
            if(cnt==0)cd=v;
            if(v==cd){
                cnt++;
            }else{
                cnt--;
            }
        }
        return cd;
    }
}