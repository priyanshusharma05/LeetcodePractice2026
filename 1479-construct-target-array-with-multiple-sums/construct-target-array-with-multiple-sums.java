class Solution {
    public boolean isPossible(int[] target) {
        if(target.length==1){
            return target[0]==1;
        }
        PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int v:target){
            pq.offer((long)v);
            sum+=v;
        } 
        while(pq.peek()!=1){
            long largest=pq.poll();
            long rest=sum-largest;

            if(largest<=rest || rest==0)return false;
            if(rest==1) return true;
            long prev=largest%rest;
            if(prev==0)return false;
            pq.offer(prev);
            sum=prev+rest;
        }
        return true;

    }
}