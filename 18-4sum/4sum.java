class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> re=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;
                int l=nums.length-1;
                
                while(k<l){
                List<Integer> ls=new ArrayList<>();
                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                if(sum==target){
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    ls.add(nums[l]);
                    re.add(ls);

                }
                if(sum>target){
                    l--;
                }else{
                    k++;
                }
                }
            }
        }
        return new ArrayList<>(re);
    }
}