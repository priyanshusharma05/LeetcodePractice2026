class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        long ans=0;
        while(i<=j){
            if(i==j){
                ans+=nums[i];
            }else{
                String tem=nums[i]+""+nums[j];
                ans+=Long.parseLong(tem);
            }
            i++;
            j--;
        }
        return ans;
    }
}