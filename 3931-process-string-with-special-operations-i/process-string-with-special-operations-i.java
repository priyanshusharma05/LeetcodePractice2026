class Solution {
    public String processStr(String s) {
        StringBuilder re=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char tem=s.charAt(i);
            if(Character.isLowerCase(tem)){
                re.append(tem);
            }else if((tem=='*') && re.length()>0){
                re.deleteCharAt(re.length()-1);
            }else if(tem=='#'){
                re.append(re);
            }else if((tem=='%') && re.length()>1){
                re.reverse();
            }
        }
        return re.toString();
    }
    
}