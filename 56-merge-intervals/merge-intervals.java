class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ls=new ArrayList<>();
        int st=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=Math.max(end,arr[i][1]);
            }else{
                ls.add(new int[] {st,end});
                st=arr[i][0];
                end=arr[i][1];
            }
        }
        ls.add(new int[] {st,end});
        int[][] ans=new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}