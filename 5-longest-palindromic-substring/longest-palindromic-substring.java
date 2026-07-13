class Solution {
    public String longestPalindrome(String s) {
        String ans="";

        if(s.length()==1)return s;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String tem=s.substring(i,j+1);
                if(ispal(tem) && tem.length()>ans.length()){
                    ans=tem;
                }
            }
        }
        return ans;
    }
    private boolean ispal(String st){
        int i=0,j=st.length()-1;
        while(i<=j){
            if(st.charAt(i)!=st.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}