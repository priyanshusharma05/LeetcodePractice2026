class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls=new ArrayList<>();
        int minid=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target)minid++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ls.add(minid);
                minid++;
            }
        }
        return ls;
    }
}