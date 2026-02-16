class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> st=new HashSet<>();
        for(int v:bulbs){
            if(st.contains(v)){
                st.remove(v);
            }else{
                st.add(v);
            }
        }
        List<Integer> re=new ArrayList<>(st);
        Collections.sort(re);
        return re;
    }
}