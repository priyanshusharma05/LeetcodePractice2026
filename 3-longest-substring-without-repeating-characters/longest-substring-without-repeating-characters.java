class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int h=0;
        int max=0;
        Set<Character> st=new HashSet<>();
        while(h<s.length()){
            
            while(st.contains(s.charAt(h))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(h));
            max=Math.max(max,h-l+1);
            h++;
        }
        return max;
    }
}