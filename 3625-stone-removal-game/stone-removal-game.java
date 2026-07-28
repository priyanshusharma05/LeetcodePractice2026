class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false;
        int a=10;
        int b=9;
       while(n>0){
        if(n<a)return false;
        n-=a;
        if(n<b)return true;
        n-=b;
        a=b-1;
        b=a-1;
       }
       return false;
    }
}