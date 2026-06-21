class Solution {
    public int maxArea(int[] ht) {
        int n=ht.length;
        int i=0;
        int j=n-1;
        int maxarea=Integer.MIN_VALUE;
        while(i<j){
            int area =(Math.min(ht[i],ht[j]))*(j-i);
            maxarea=Math.max(maxarea,area);
            if(ht[i]<ht[j]){
                i++;
            }
            else if(ht[i]>ht[j]){
                j--;
            }
            else{
                if(ht[i+1]>ht[j-1]){
                    i++;
                }else{
                    j--;
                }
        }
    }
        return maxarea;
}
}