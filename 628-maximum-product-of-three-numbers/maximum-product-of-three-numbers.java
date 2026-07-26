class Solution {
    public int maximumProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        int m3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int v:nums){
            if(v>=m1){
                m3=m2;
                m2=m1;
                m1=v;
            }
            else if(v>=m2){
                m3=m2;
                m2=v;
            }
            else if(v>m3){
                m3=v;
            }

            if(v<=min1){
                min2=min1;
                min1=v;
            }else if(v<min2 ){
                min2=v;
            }
        }
        return Math.max(m1*m2*m3,m1*min1*min2);
    }
}