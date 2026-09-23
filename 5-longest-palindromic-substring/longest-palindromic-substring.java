class Solution {
    public String longestPalindrome(String s) {
        String lp="";
        if(s.length()==1)return s;
        for(int i=1;i<s.length();i++){
            int lo=i;
            int hi=i;
            int lo2=i-1;
            int hi2=i;
            while(lo>=0 && hi<s.length() && s.charAt(lo)==s.charAt(hi)){
                lo--;
                hi++;
            }
            if((hi-lo-1)>lp.length())lp=s.substring(lo+1,hi);

            while(lo2>=0 && hi2 < s.length() && s.charAt(lo2)==s.charAt(hi2)){
                lo2--;
                hi2++;               
            }
            if((hi2-lo2-1)>lp.length())lp=s.substring(lo2+1,hi2);
        }
        return lp;

    }
}