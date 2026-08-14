class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int ri=0;
        int maxlen=Integer.MIN_VALUE;
        Map<Integer,Integer> mp=new HashMap<>();
        while(ri<n){
            mp.put(nums[ri],mp.getOrDefault(nums[ri],0)+1);
            while(mp.get(nums[ri])>k){
                if(mp.get(nums[left])>0){
                    mp.put(nums[left],mp.get(nums[left])-1);
                }else{
                    mp.remove(nums[left]);
                }
                left++;
            }
            maxlen=Math.max(maxlen,ri-left+1);
            ri++;
        }
        return maxlen;
    }
}