class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int v:nums)mp.put(v,mp.getOrDefault(v,0)+1);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            pq.add(new int[] {entry.getValue(),entry.getKey()});
            if(pq.size()>k)pq.poll();
        }
        int[] re=new int[k];
        for(int i=0;i<k;i++){
            if(!pq.isEmpty()){
            re[i]=pq.poll()[1];
            }
        }
        return re;

    }
}