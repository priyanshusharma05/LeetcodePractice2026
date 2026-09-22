class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        for(String st:strs){
            char[] ar=st.toCharArray();
            Arrays.sort(ar);
            String s=new String(ar);
            mp.putIfAbsent(s,new ArrayList<>());
            mp.get(s).add(st);
        }
        List<List<String>> ans=new ArrayList<>();
        for(List<String> tem:mp.values())ans.add(tem);
        return ans;
    }
}