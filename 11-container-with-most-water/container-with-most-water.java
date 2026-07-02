class Solution {
    public int maxArea(int[] height) {
        int maxarea=-1;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int area=(Math.min(height[i],height[j]))*(j-i);
            maxarea=Math.max(maxarea,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxarea;
    }
}