class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        Set<Integer> st=new HashSet<>();
        for(int v:nums){
            if(st.size()>0 && st.contains(v))return v;
            st.add(v);
        }
        return -1;
    }
}