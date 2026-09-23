class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr=Arrays.copyOf(nums,nums.length);
        if(nums.length<=2)return nums.length;
        int j=2;
        for(int i=2;i<nums.length;i++){
            if(arr[i]!=arr[i-2]){
                nums[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}