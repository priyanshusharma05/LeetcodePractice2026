class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int v:nums){
            if(st.contains(v))return true;
            st.add(v);
        }
        return false;
    }
}