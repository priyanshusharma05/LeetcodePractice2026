class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
        int[] tem=new int[nums.length-1];
        for(int i=0;i<tem.length;i++){
            tem[i]=nums[i+1];
        }
        Arrays.sort(tem);
        sum+=tem[0];
        sum+=tem[1];
        return sum;
        
    }
}