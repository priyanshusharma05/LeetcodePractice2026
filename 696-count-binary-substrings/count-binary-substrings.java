class Solution {
    public int countBinarySubstrings(String s) {
        
        int n = s.length();
        int ans = 0;
        
        int prevGroup = 0;
        int currGroup = 1;
        
        for (int i = 1; i < n; i++) {
            
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            } else {
                ans += Math.min(prevGroup, currGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }
        ans += Math.min(prevGroup, currGroup);
        return ans;
    }
}
