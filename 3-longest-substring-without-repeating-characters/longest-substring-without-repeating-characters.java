class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[] arr=new int[256];
            for(int j=i;j<n;j++){
                if(arr[s.charAt(j)]==1)break;
                arr[s.charAt(j)]=1;
                maxlen=Math.max(maxlen,(j-i+1));
            }
        }
        return maxlen;
    }
}