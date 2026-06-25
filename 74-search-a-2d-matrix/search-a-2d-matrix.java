class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(searchrow(matrix[mid],target))return true;
            if(matrix[mid][0]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    public boolean searchrow(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
        int mid=(i+j)/2;
        if(arr[mid]==target)return true;
        if(arr[mid]>target){
            j=mid-1;
        }else{
            i=mid+1;
        }
        }
        return false;
    }
}