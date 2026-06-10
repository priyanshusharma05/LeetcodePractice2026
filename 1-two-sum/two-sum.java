class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int tem=target-nums[i];
            if(mp.containsKey(tem) && mp.get(tem)!=i){
                return new int[] { i,mp.get(tem)};
            }
        }
        return new int[]{};
    }
}