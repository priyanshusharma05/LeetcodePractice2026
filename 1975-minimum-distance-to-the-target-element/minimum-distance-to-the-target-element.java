class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mind=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target)mind=Math.min(mind,Math.abs(i-start));
        }
        return mind;
    }
}