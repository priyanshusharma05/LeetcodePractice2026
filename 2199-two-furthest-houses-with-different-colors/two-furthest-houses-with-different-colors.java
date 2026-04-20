class Solution {
    public int maxDistance(int[] colors) {
        int max=-1;
        for(int i=0;i<colors.length;i++){
            int j=i+1;
        while(j<colors.length){
            if(colors[i]!=colors[j]){
                max=Math.max(max,(j-i));
            }
            j++;
        }
        }
        return max;
    }
}