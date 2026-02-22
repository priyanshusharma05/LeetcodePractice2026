class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max=-1;
        int st=0;
        for(int i=0;i<s.length();i++){
            if(st!=-1 && s.charAt(i)=='1'){
                max=Math.max(max,i-st);
                st=-1;
            }
            if(s.charAt(i)=='1'){
                st=i;
            }
        }
        return max;
    }
}