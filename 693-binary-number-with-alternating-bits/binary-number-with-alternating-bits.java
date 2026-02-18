class Solution {
    public boolean hasAlternatingBits(int n) {
        String st=Integer.toBinaryString(n);
        if(st.length()==1)return true;
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1))return false;
        }
        return true;
    }
}