class Solution {
    public int findKthPositive(int[] arr, int k) {
        int c=0;
        for(int i=1;i<=arr[arr.length-1]+k;i++){
            if(bs(arr,i)==-1)c++;
            if(c==k){
                return i;
            }
        }
        return -1;
    }
    private int bs(int[] arr, int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}