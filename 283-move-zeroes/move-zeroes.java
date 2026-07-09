class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int tem=nums[i];
                nums[i]=nums[k];
                nums[k]=tem;
                k++;
            }
        }
    }
}