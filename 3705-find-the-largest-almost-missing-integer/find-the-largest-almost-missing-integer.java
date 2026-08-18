class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans=-1;
        int max=nums[0];
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int v:nums){
            max=Math.max(max,v);
            mp.put(v,mp.getOrDefault(v,0)+1);
        }
        if(k==n)
        {ans= max;
        }
        else if(k==1){
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                if(entry.getValue()==1)ans=Math.max(ans,entry.getKey());
            }
        }
        else if(k>1 && k<n){
            int t1=mp.get(nums[0]);
            int t2=mp.get(nums[n-1]);
            if(t1==1 && t2==1){
                ans=Math.max(nums[0],nums[n-1]);
            }else if(t1==1){
                ans=nums[0];
            }else if(t2==1){
                ans=nums[n-1];
            }
        }
        return ans;
    }
}