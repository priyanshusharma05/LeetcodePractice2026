class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(String s:op){
            if(s.equals("+")){
            int top=st.pop();
            int tem=top+st.peek();
            st.push(top);
            st.push(tem);
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(s));
            }
            
        }
        for(int v:st)ans+=v;
        return ans;
    }
}