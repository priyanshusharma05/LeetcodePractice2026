class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans=new int[arr.length];
        int[] tem=Arrays.copyOf(arr,arr.length);
        Arrays.sort(tem);
        Map<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int v:tem){
            if(!mp.containsKey(v)){
                mp.put(v,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=mp.get(arr[i]);
        }
        return ans;
    }
}