class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:moves.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int Uf=mp.getOrDefault('U',0);
        int Df=mp.getOrDefault('D',0);
        int Lf=mp.getOrDefault('L',0);
        int Rf=mp.getOrDefault('R',0);
        if(Uf==Df && Lf==Rf)return true;
        return false;
    }
}