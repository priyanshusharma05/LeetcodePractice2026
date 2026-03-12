class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        String re=sb.toString();
        return Integer.parseInt(re,2);
    }
}