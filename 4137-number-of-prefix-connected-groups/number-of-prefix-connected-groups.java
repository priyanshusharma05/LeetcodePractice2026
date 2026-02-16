class Solution {
    public int prefixConnected(String[] words, int k) {
       Map<String,Integer> mp=new HashMap<>();
       for(String st:words){
        if(st.length()>=k){
            String sub=st.substring(0,k);
            mp.put(sub,mp.getOrDefault(sub,0)+1);
        }
       } 
       int ans=0;
       for(Integer value : mp.values()){
        if(value>1)ans++;
       }
       return ans;
    }
}