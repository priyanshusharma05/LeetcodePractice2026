class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int v:nums)st.add(v);
        if(st.size()==nums.length)return false;
        return true;
    }
}