class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int[] pfmax=new int[n];
        pfmax[0]=arr[0];
        int[] sfmax=new int[n];
        sfmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            pfmax[i]=Math.max(pfmax[i-1],arr[i]);
            sfmax[n-i-1]=Math.max(sfmax[n-i],arr[n-i-1]);
        }
        int total=0;
        for(int i=0;i<n;i++){
            int lev=Math.min(pfmax[i],sfmax[i]);
            total+=lev-arr[i];
        }
        return total;
    }
}