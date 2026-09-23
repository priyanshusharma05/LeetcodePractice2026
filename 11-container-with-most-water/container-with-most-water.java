class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int area=Math.min(nums[l],nums[r])*(r-l);
            max=Math.max(max,area);
            if(nums[l]<nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}