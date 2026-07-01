class Solution {
    public int[][] merge(int[][] intrv) {
        Arrays.sort(intrv,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ls=new ArrayList<>();
        int st=intrv[0][0];
        int end=intrv[0][1];
        for(int i=1;i<intrv.length;i++){
            if(intrv[i][0]<=end){
                end=Math.max(end,intrv[i][1]);
            }else{
                ls.add(new int[] {st,end});
                st=intrv[i][0];
                end=intrv[i][1];
            }
        }
        ls.add(new int[] {st,end});
        int[][] re=new int[ls.size()][2];
        for(int i=0;i<ls.size();i++){
            re[i]=ls.get(i);
        }
        return re;
    }
}