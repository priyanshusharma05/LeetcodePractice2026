class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        int j=0;
        Set<Character>st=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(st.contains(ch)){
                st.remove(s.charAt(j));
                j++;
            }
            st.add(ch);
            maxl=Math.max(maxl,(i-j+1));
        }
        return maxl;
    }
}