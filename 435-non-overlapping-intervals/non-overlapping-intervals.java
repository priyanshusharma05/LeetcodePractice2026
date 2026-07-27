class Solution {
    public int eraseOverlapIntervals(int[][] intr) {
        Arrays.sort(intr,(a, b) ->{
            if(a[1]!=b[1]) {
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int cnt=0;
        int end=intr[0][1];
        for(int i =1;i<intr.length;i++){
            if(intr[i][0]<end)
            {cnt++;
            }else{
            end=intr[i][1];
            }
        }
        return cnt;

    }
}