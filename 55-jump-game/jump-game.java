class Solution {
    public boolean canJump(int[] nums) {
        int maxid=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxid)return false;
            maxid=Math.max(maxid,i+nums[i]);
        }
        return true;
    }
}