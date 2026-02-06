class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length==1)return 0;
        Arrays.sort(nums);
        int L=1;
        int min=nums[0];
        int max=nums[0];
        int i=0;
        int j=0;
        while(j<nums.length){
            min=nums[i];
            max=nums[j];
            while(i<j && max> (long)k*min){
                i++;
                min=nums[i];
            }
            L=Math.max(L,j-i+1);
            j++;
        }
        return nums.length-L;
    }
}