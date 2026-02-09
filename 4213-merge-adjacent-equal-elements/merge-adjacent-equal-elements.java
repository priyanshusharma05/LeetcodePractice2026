class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st=new Stack<>();
        List<Long> ls=new ArrayList<>();
        for(long v:nums){
            while (!st.isEmpty() && st.peek() == v) {
                v += st.pop();
            }
            st.push(v);
        }
        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        Collections.reverse(ls);
        return ls;
    }
}