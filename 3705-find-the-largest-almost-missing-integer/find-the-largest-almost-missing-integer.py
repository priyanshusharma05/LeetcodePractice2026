class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        fq={}
        for i in nums:
            fq[i]=fq.get(i,0)+1
        ans=-1
        if k==len(nums):
            ans= max(nums)
        elif k==1:
            for k,v in fq.items():
                if(v==1):
                    ans=max(ans,k)
            
        elif k>1 and k <len(nums):
            t1=fq.get(nums[0])
            t2=fq.get(nums[-1])
            if(t1==1 and t2==1):
                ans= max(nums[0],nums[-1])
            elif t1==1:
                ans= nums[0]
            elif t2==1:
                ans= nums[-1]
        return ans