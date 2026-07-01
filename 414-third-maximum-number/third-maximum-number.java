class Solution {
    public int thirdMax(int[] arr) {
        int n=arr.length;
        Long first=Long.MIN_VALUE;
        Long sec=Long.MIN_VALUE;
        Long thrd=Long.MIN_VALUE;
        for(int el:arr){
            long v=(long)el;
            if(v>first){
                thrd=sec;
                sec=first;
                first=v;
            }else if(v>sec && v!=first){
                thrd=sec;
                sec=v;
            }else if(v>thrd && v!=first && v!=sec){
                thrd=v;
            }
        }
        if(thrd==Long.MIN_VALUE)return first.intValue();
        return thrd.intValue();
    }
}