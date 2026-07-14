class Solution {
    public int singleNonDuplicate(int[] nums) {
        int st=0;
        int end=nums.length-1;
        if(nums.length==1)return nums[0];
        while(st<=end){
            int mid=(st+end)/2;
            if(mid!=0 && mid!=nums.length-1 && (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])){
                return nums[mid];
            }else if(mid==0){
                if(nums[mid]!=nums[mid+1])return nums[mid];
            }else if(mid==nums.length-1){
                if(nums[mid]!=nums[mid-1])return nums[mid];
            }
            if(iseven(mid)){
                if(nums[mid]==nums[mid+1]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(nums[mid]==nums[mid+1]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return -1;
        
    }
    private boolean iseven(int n){
        if(n%2==0)return true;
        return false;
    }
}