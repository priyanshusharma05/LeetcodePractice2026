class Solution {
    public int missingInteger(int[] nums) {
        int max=nums[0];
        int ps=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]+1){
                ps+=nums[j];
            }else{
                break;
            }
        }
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums) {
            seen.add(num);
        }
        int answer=ps;
        while(seen.contains(answer)){
            answer++;
        }
        return answer;
        
    }
}