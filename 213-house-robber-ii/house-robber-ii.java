class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        return Math.max(rob1(nums,0,n-1),rob1(nums,1,n));
    }
    private int rob1(int[] arr,int st,int end){
        int prev2=arr[st];
        int prev1=Math.max(arr[st],arr[st+1]);
        for(int i=st+2;i<end;i++){
            int curr=Math.max(prev1,prev2+arr[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}