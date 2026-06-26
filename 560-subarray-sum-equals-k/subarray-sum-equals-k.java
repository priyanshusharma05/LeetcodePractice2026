class Solution {
    public int subarraySum(int[] nums, int k) {
        int currs=0;
        int count=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int v:nums){
            currs+=v;
            if(mp.containsKey(currs-k)){
                count+=mp.get(currs-k);
            }
            mp.put(currs,mp.getOrDefault(currs,0)+1);
        }
        return count;
    }
}