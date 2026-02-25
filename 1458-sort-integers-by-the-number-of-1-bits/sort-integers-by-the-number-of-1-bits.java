class Solution {
    public int[] sortByBits(int[] arr) {
        if(arr.length==1)return arr;
        Arrays.sort(arr);
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ls.add(Arrays.asList(arr[i],Integer.bitCount(arr[i])));
        }
        Collections.sort(ls, (a,b) -> Integer.compare(a.get(1),b.get(1)));
        int[] re=new int[arr.length];
        int ind=0;
        for(List v:ls){
            re[ind]=(int) v.get(0);
            ind++;
        }
        return re;
    }
}