class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int v:nums){
            if(st.contains(v))ls.add(v);
            st.add(v);
        }
        return ls;
    }
}