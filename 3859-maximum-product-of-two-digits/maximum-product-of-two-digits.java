class Solution {
    public int maxProduct(int n) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        while(n>0){
            int dig=n%10;
            if(dig>m1){
                m2=m1;
                m1=dig;
                
            }
            else if(dig>m2)m2=dig;
            n/=10;
        }
        return m1*m2;
    }
}