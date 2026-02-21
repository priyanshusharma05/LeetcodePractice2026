class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;
        for(int i=left;i<=right;i++){
            int tem=Integer.bitCount(i);
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
}