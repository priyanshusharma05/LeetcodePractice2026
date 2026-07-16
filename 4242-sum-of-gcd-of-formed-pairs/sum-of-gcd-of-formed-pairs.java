class Solution {
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] prefgcd=new int[nums.length];
        for(int i=0;i<prefgcd.length;i++){
            max=Math.max(max,nums[i]);
            prefgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefgcd);
        long ans=0;
        int i=0;
        int j=prefgcd.length-1;
        while(i<j){
            ans+=gcd(prefgcd[i],prefgcd[j]);
            i++;
            j--;
        }
        return ans;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}