class Solution {
    public int largestInteger(int n, int s) {
        int[] pos={9,99,999,9999,99999};
        int num=pos[n-1];
        for(int i=num;i>=0;i--){
            if(sum(i)==s)return i;
        }
        return -1;
    }
  private int sum(int n){
    int sm=0;
    while(n>0){
        sm+=n%10;
        n/=10;
    }
    return sm;
  }
}