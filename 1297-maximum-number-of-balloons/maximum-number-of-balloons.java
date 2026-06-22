class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:text.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        b=mp.getOrDefault('b', 0);
        a=mp.getOrDefault('a', 0);
        l=mp.getOrDefault('l', 0)/2;
        o=mp.getOrDefault('o', 0)/2;
        n=mp.getOrDefault('n', 0);
        return Math.min(Math.min(Math.min(Math.min(b,a),l),o),n);

    }
}