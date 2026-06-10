class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String end=strs[strs.length-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(st.length(),end.length());i++){
            if(st.charAt(i)!=end.charAt(i))return ans.toString();
            ans.append(st.charAt(i));
        }
        return ans.toString();
    }
}