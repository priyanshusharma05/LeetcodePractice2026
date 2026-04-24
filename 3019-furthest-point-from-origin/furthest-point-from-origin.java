class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0;
        int l=0;
        int us=0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                l++;
            }else if(moves.charAt(i)=='R'){
                r++;
            }else{
                us++;
            }
        }
        return Math.abs(l-r) + us;
    }
}