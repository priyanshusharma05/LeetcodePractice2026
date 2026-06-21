class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        int sum=0;
        if(costs[0]>coins)return 0;
        for(int i=0;i<costs.length;i++){
            if(sum>=coins)return cnt;
            if(coins-sum >= costs[i]){
            sum+=costs[i];
            cnt++;
            }
        }
        return cnt;
    }
}