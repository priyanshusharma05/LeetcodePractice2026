class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long gsum=0;
        for(int[] row:grid){
            for(int v:row){
                gsum+=v;
            }
        }
        long rsum=0;
        for(int[] row:grid){
            for(int v:row){
                if(rsum==(gsum-rsum))return true;
                if(rsum>(gsum-rsum))break;
                rsum+=v;
            }
        }

        long csum=0;
        for(int col=0;col<n;col++){
            for(int row=0;row<m;row++){
                if(csum==(gsum-csum))return true;
                if(csum>(gsum-csum))break;
                csum+=grid[row][col];
            }
        }
        return false;

    }
}