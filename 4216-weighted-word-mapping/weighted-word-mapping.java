class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String re="";
        for(String wd:words){
            int w=weight(wd,weights);
            int c=w%26;
            re+= (char) (122-c);
        }
        return re;
    }
    private int weight(String s, int[] arr){
        int val=0;
        for(char ch:s.toCharArray()){
            val+= arr[((int) ch-97)];
        }
        return val;
    }
}