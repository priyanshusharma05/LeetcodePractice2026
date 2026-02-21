class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        for(int i=left;i<=right;i++){
            int tem=setbit(i);
            if(isprime(tem))result++;
        }
        return result;
    }
    private boolean isprime(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }
    private int setbit(int n){
        String s=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;
        }
        return c;
    }
}