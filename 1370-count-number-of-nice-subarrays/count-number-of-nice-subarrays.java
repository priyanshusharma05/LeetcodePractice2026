class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count =0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int odd=0;
        for(int v:nums){
            if(v%2==1)odd++;
            if(mp.containsKey(odd-k)){
                count+=mp.get(odd-k);
            }
            mp.put(odd,mp.getOrDefault(odd,0)+1);
        }
        return count;
    }
}