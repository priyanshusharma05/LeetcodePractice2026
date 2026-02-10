class Solution {
    public String reverseWords(String s) {
        String st=s.trim();
        String[] arr=st.split("\\s+");
        String re="";
        for(int i=arr.length-1;i>0;i--){
            re+=arr[i]+" ";
        }
        re+=arr[0];
        return re;

    }
}