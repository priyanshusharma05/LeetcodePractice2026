class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1;
        int q=-1;
        boolean flag1=false;
        boolean flag2=false;
        boolean flag3=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                p=i;
                flag1=true;
            } else break;
        }
        if(p!=-1 && p<nums.length-1){
            for(int j=p+1;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    q=j;
                    flag2=true;
                } else break;
            }
        }
        if(q!=-1 && q<nums.length-1){
            for(int k=q+1;k<nums.length-1;k++){
                if(nums[k] < nums[k+1]){
                    flag3=true;
                } else return false;;
            }
        }
        if(flag1 && flag2 && flag3){
            return true;
        }
        return false;
    }
}
