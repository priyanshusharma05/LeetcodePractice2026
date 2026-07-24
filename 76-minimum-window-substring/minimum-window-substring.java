class Solution {
    public String minWindow(String s, String t) {
        int minlen=Integer.MAX_VALUE;
        int st=0;
        int left=0;
        int ri=0;
        int[] hash=new int[256];
        int count=0;
        for(char ch:t.toCharArray())hash[ch]++;
        while(ri<s.length()){
            char ch=s.charAt(ri);
            
            if(hash[ch]>0){
                count++;
            }
            hash[ch]--;
            while(count==t.length()){
                if((ri-left+1)<minlen){
                    minlen=(ri-left+1);
                    st=left;
                }
                char c=s.charAt(left);
                hash[c]++;
                if(hash[c]>0)count--;
                left++;
            }
            ri++;
        }
        if(minlen == Integer.MAX_VALUE)return "";
        return s.substring(st,st+minlen);
    }
}