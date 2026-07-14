class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return func(nums,k)-func(nums,k-1);
    }
    public int func(int[] nums,int k){
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        int left=0;
        int ri=0;
        while(ri<nums.length){
            mp.put(nums[ri],mp.getOrDefault(nums[ri],0)+1);
            while(mp.size()>k){
                mp.put(nums[left],mp.get(nums[left])-1);
                if(mp.get(nums[left])==0){
                    mp.remove(nums[left]);
                }
                left++;
            }
            if(mp.size()<=k){
                count+=(ri-left+1);
            }
            ri++;
        }
        return count;
    }
}