class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int k=0;
        int n=nums.length;
        int j=n-1;
        while(k<=j){
            if(nums[k]==0){
                int tem=nums[k];
                nums[k]=nums[i];
                nums[i]=tem;
                i++;
                k++;
            }
            else if(nums[k]==2){
                int t=nums[k];
                nums[k]=nums[j];
                nums[j]=t;
                j--;
            }else{
                k++;
            }
        }

    }
}