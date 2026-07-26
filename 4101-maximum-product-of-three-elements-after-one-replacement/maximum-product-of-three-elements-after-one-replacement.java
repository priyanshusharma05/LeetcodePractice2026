class Solution {
    public long maxProduct(int[] nums) {
        int mx1=Integer.MIN_VALUE;
        int mx2=Integer.MIN_VALUE;
        int mn1=Integer.MAX_VALUE;
        int mn2=Integer.MAX_VALUE;
        for(int v:nums){
            if(v>=mx1){
                mx2=mx1;
                mx1=v;
            }else if(v>mx2){
                mx2=v;
            }
            if(v<mn1){
                mn2=mn1;
                mn1=v;
            }else if(v<mn2){
                mn2=v;
            }
        }
        long pos1=(long)mx1*mx2*100000;
        long pos2=(long)mn1*mn2*100000;
        long pos3=(long)mn1*mx1*(-100000);
        return Math.max(pos1,Math.max(pos2,pos3));
    }
}