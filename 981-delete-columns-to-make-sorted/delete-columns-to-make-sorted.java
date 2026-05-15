class Solution {
    public int minDeletionSize(String[] strs) {
        int del=0;
        int j=0;
        while(j<strs[0].length()){
        for(int i=0;i<strs.length-1;i++){
            if(strs[i].charAt(j)>strs[i+1].charAt(j)){
                del++;
                break;
                }
        }
        j++;
        }
        return del;
    }
}