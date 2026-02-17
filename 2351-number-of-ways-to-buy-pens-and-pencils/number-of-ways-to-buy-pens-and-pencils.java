class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways=0;
        for (long p=0; p*cost1<=total; p++) {
            long rem =total-p*cost1;
            long maxp =rem/cost2;
            ways +=(maxp + 1);
        }
        return ways;
    }
}
