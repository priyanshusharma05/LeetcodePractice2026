class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int v:nums){
            mp.put(v,mp.getOrDefault(v,0)+1);
        }
        Map<Integer,Integer> mp2=new HashMap<>();
        for(int f:mp.values()){
            mp2.put(f,mp2.getOrDefault(f,0)+1);
        }
        for(int num:nums){
            int freq=mp.get(num);
            if(mp2.get(freq)==1)return num;
        }
        
        return -1;
    }
}