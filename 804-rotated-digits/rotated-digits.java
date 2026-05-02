class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(isgood(i))ans++;
        }
        return ans;
    }
    private boolean isgood(int n ){
        boolean cng=false;
        boolean vld=true;
        while(n>0){
            int d=n%10;
            if(d==3 || d==4 || d==7){
                vld=false;
                break;
            }
            if(d ==2 ||d == 5 ||d == 6 ||d == 9){
                cng=true;
            }
            n=n/10;
        }
        if(vld ==true && cng==true){
            return true;
        }else{
            return false;
        }
    }
}