class Solution {
    public int maxProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int v:nums){
            if(v>=m1){
                m2=m1;
                m1=v;
            }else if(v>m2){
                m2=v;
            }
        }
        return (m1-1)*(m2-1);
    }
}