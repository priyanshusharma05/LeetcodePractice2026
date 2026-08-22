class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int tem=n;
        while(tem>0){
            int dig=tem%10;
            sum+=dig;
            prod*=dig;
            tem/=10;
        }
        if(n%(sum+prod)==0)return true;
        return false;
    }
}