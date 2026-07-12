class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
         Stack<Character> st=new Stack<>();
         for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(!st.isEmpty()&& st.peek()==ch){
            while(!st.isEmpty()&& st.peek()==ch)st.pop();
            }else{
            st.push(ch);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        return ans.reverse().toString();
    }
}