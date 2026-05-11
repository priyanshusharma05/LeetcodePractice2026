class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        for(int v:nums){
            String st=Integer.toString(v);
            int p=0;
            while(p<st.length()){
                ls.add(st.charAt(p)-'0');
                p++;
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}