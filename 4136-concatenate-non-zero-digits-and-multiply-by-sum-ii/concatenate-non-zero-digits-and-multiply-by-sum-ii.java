class Solution {
    static final long MOD = 1_000_000_007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();


        long[] prefSum = new long[n + 1];

        int[] cnt = new int[n + 1];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            prefSum[i + 1] = prefSum[i] + d;

            cnt[i + 1] = cnt[i];
            if (d != 0) {
                sb.append((char) ('0' + d));
                cnt[i + 1]++;
            }
        }

        String nz = sb.toString();
        int m = nz.length();


        long[] pow = new long[m + 1];
        pow[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow[i] = (pow[i - 1] * 10) % MOD;
        }

        long[] hash = new long[m + 1];
        for (int i = 0; i < m; i++) {
            int d = nz.charAt(i) - '0';
            hash[i + 1] = (hash[i] * 10 + d) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum = prefSum[r + 1] - prefSum[l];

            int a = cnt[l];
            int b = cnt[r + 1];

            long value = (hash[b] - hash[a] * pow[b - a]) % MOD;
            if (value < 0) value += MOD;

            ans[i] = (int) ((value * (sum % MOD)) % MOD);
        }

        return ans;
    }
}