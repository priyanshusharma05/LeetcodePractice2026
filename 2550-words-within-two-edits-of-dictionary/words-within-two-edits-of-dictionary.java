class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> re=new ArrayList<>();
        for(String v:queries){
            for(String w:dictionary){
                if(match(v,w)){
                    re.add(v);
                    break;
                }
            }
        }
        return re;
    }
    private boolean match(String s1, String s2){
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(cnt>2)break;
            if(s1.charAt(i)!=s2.charAt(i))cnt++;
        }
        if(cnt<=2)return true;
        return false;
    }
}