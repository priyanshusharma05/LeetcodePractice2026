class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] ar:matrix){
            for(int v:ar)
            {pq.add(v);
            if(pq.size()>k)pq.poll();
            }
        }
        return pq.poll();
    }
}