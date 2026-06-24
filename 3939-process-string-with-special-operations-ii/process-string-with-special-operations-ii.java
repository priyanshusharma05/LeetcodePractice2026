class Solution {
    public char processStr(String s, long k) {
        long len=getlen(s);
        if(k>=len)return '.';
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='*'){
                len++;
            }
            else if(ch=='#'){
                len/=2;
                if(k>=len)k=k-len;
            }
            else if(ch=='%'){
                k=len-k-1;
            }
            else if(k==len-1){
                return ch;
            }else{
                len--;
            }
        }
        return '.';
    
    }
    public long getlen(String s){
        long len=0;
        for(char c:s.toCharArray()){
            if(c=='*'){
              len = Math.max(0, len - 1);
            }else if( c=='#'){
                len*=2;
            }else if(c=='%'){
                len=len;
            }else{
                len++;
            }
        }
        return len;
    }
}