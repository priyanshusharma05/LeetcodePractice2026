class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String tem="";
        for(String v:words){
            tem+=v.charAt(0);
        }
        return s.equals(tem);
    }
}