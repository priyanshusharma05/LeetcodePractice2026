class Solution {
    public int minBitFlips(int start, int goal) {
        int re=start^goal;
        int ans=Integer.bitCount(re);
        return ans;
    }
}