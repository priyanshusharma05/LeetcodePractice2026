class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int maxlen=Integer.MIN_VALUE;
        int left=0;
        int ri=0;
        int[] fq=new int[26];
        while(ri<n){
            char c=s.charAt(ri);
            fq[c-'a']++;
            while(fq[c-'a']>2){
                fq[s.charAt(left)-'a']--;
                left++;
            }
            maxlen=Math.max(maxlen,ri-left+1);
            ri++;
        }
        return maxlen;
    }
}