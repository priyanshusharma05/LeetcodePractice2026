class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> re=new ArrayList<>();
        for(int v:bulbs){
            mp.put(v,mp.getOrDefault(v,0)+1);
        }
        for(int i=0;i<bulbs.size();i++){
            int tem=bulbs.get(i);
            if(mp.get(tem)%2!=0 && !re.contains(tem))re.add(tem);
        }
        Collections.sort(re);
        return re;
    }
}