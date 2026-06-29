class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(String v:patterns){
            if(word.contains(v))cnt++;
        }
        return cnt;
    }
}