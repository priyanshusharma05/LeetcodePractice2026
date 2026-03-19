class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String doubled = s + s;
        
        int minFlips=Integer.MAX_VALUE;
        int mismatch1=0;
        int mismatch2=0;

        for (int i=0;i<2*n;i++) {
            char c =doubled.charAt(i);
            char expected1= (i%2==0) ?'0':'1';
            char expected2= (i%2==0) ?'1':'0';
            
            if (c!=expected1) mismatch1++;
            if (c!=expected2) mismatch2++;
            if (i>=n) {
                char removed=doubled.charAt(i - n);
                char removedExpected1=((i-n)%2==0)?'0':'1';
                char removedExpected2=((i-n)%2==0)?'1':'0';
                
                if(removed != removedExpected1) mismatch1--;
                if(removed != removedExpected2) mismatch2--;
            }
            if (i>=n-1) {
                minFlips = Math.min(minFlips, Math.min(mismatch1, mismatch2));
            }
        }
    
        return minFlips;
    }
}