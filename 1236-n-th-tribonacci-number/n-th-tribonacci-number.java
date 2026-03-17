class Solution {
    public int tribonacci(int n) {
        int a=0,b=1,c=1,d=0;
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        while(n>2){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
            n--;
        }
        return c;
    }
}