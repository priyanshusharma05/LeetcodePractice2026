class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fs=0;
        int ts=0;
        for(int v:bills){
            if(v==5){
                fs++;
            }
            else if(v==10){
                if(fs<1)return false;
                ts++;
                fs-=1;
            }
            else if(v==20){
                if(ts>0){
                    v-=10;
                    ts--;
                }
                while(fs>0 && v>5){
                    v-=5;
                    fs--;
                }
                if(v>5)return false;
            }
        }
        return true;
    }
}