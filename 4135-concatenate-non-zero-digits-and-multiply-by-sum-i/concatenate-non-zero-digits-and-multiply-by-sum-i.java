class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return (long)n;
        int tem=n;
        int sum=0;
        long num=0;
        int base=1;
        while(tem>0){
            int dig=tem%10;
            if(dig!=0){
            sum+=dig;
            num=dig*base+num;
            base*=10;
            }
            tem/=10;
        }
        long re=num*sum;
        return re;
    }
}