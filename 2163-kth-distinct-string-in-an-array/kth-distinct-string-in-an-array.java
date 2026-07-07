class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> mp=new HashMap<>();
        for(String v:arr){
            mp.put(v,mp.getOrDefault(v,0)+1);
        }
        int ct=0;
        for(int i=0;i<arr.length;i++){
            
            if(mp.get(arr[i])==1)ct++;
            if(ct==k)return arr[i];

        }
        return "";
    }
}