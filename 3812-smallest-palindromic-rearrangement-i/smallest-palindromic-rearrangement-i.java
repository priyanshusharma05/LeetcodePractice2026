class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1)return s;
        int n=s.length();
        String firsth=s.substring(0,n/2);
        char[] arr=firsth.toCharArray();
        Arrays.sort(arr);
        String strdfirsth=new String(arr);
        StringBuilder sb=new StringBuilder(strdfirsth);
        if(n%2!=0){
            sb.append(s.charAt(n/2));
        }
        for(int i=strdfirsth.length()-1;i>=0;i--){
            sb.append(strdfirsth.charAt(i));
        }
        return sb.toString();

    }
}