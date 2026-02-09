class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=Integer.MAX_VALUE;
        int st=1;
        int end=findmax(nums);
        while(st<=end){
            int mid=(st+end)/2;
            int tem=getsum(nums,mid);
            if(tem <= threshold){
                ans=mid;
                end=mid-1;
            }
            if(tem>threshold){
                st=mid+1;
            }
        }
        return ans;
    }
    private int getsum(int arr[],int k){
        int sum=0;
        for(int v:arr){
            sum+=(v + k - 1) / k;;
        }
        return sum;
    }
    private int findmax(int[] A){
        int max=0;
        for(int v:A){
            if(v>max)max=v;
        }
        return max;
    }
}