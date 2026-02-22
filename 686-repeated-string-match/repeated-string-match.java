class Solution {
    public int repeatedStringMatch(String a, String b) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        while(sb.length()<b.length()){
            sb.append(a);
            c++;
        }
        if(sb.indexOf(b)!=-1)return c;
        sb.append(a);
        c++;
        if(sb.indexOf(b)!=-1)return c;
        return -1;
    }
}