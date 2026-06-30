class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int[] arr=new int[3];
        int re=0;
        int left=0;
        for(int ri=0;ri<n;ri++){
            arr[s.charAt(ri)-'a']++;
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                re+=n-ri;
                arr[s.charAt(left)-'a']--;
                left++;
            }
        }
        return re;
    }
}