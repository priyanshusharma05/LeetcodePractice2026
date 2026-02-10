class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> ev=new HashSet<>();
            Set<Integer> od=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(iseven(nums[j])){
                    ev.add(nums[j]);
                }else{
                    od.add(nums[j]);
                }

                if(ev.size()==od.size()){
                ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private boolean iseven(int n){
        if(n%2==0)return true;
        return false;
    }
}