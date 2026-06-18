class Solution {
    public int compress(char[] chars) {
        int id=0;
        for(int i=0;i<chars.length;i++){
            int j=i+1;
            int cnt=1;
            while(j<chars.length && chars[j]==chars[i]){
                cnt++;
                j++;
            }
            chars[id]=chars[i];
            id++;
            if(cnt>1){
                String tem=Integer.toString(cnt);
                for(char c:tem.toCharArray()){
                    chars[id]=c;
                    id++;
                }
            }
            i=j-1;
        }
        return id;

    }
}