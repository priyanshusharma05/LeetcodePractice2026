class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int left=0;
        int ri=0;
       Map<Integer,Integer> mp=new HashMap<>();
       while(ri<fruits.length){
        mp.put(fruits[ri],mp.getOrDefault(fruits[ri],0)+1);
        if(mp.size()<=2){
            maxlen=Math.max(maxlen,ri-left+1);
        }else{
            while(mp.size()>2){
                int fr=fruits[left];
                mp.put(fr,mp.get(fr)-1);
                if(mp.get(fr)==0){
                    mp.remove(fr);
                }
                left++;
            }
        }
        ri++;
       }
        return maxlen;
    }
}