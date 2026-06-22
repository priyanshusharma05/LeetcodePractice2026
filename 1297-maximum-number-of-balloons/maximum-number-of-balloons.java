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
        for(Map.Entry<Character,Integer> entry:mp.entrySet()){
            if(entry.getKey()=='b')b=entry.getValue();
            if(entry.getKey()=='a')a=entry.getValue();
            if(entry.getKey()=='l')l=entry.getValue();
            if(entry.getKey()=='o')o=entry.getValue();
            if(entry.getKey()=='n')n=entry.getValue();
        }
        o=o/2;
        l=l/2;
        return Math.min(Math.min(Math.min(Math.min(b,a),l),o),n);

    }
}