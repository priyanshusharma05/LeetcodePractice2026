class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int[] fq=new int[26];
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                if(fq[c-'a']<2){
                    fq[c-'a']++;
                    maxlen=Math.max(maxlen,(j-i+1));
                }else{
                    break;
                }
            }
            
        }
        return maxlen;
    }
}