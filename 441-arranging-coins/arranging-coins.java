class Solution {
    public int arrangeCoins(int n) {
        long st=1,end=n;
        while(st<=end){
            long mid=st+(end-st)/2;
            long sum=(mid*(mid+1))/2;
            if(sum==n)return (int)mid;
            if(sum<n){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int) end;
    }
}