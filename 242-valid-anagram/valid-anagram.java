class Solution {
    public boolean isAnagram(String s, String t) {
       int[] fq=new int[26];
       if(s.length()!=t.length())return false;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        char c1=t.charAt(i);
        fq[c-'a']++;
        fq[c1-'a']--;
       }
       for(int v:fq){
        if(v!=0)return false;
       }
       return true;
       

    }
}