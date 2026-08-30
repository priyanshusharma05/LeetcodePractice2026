class Solution:
    def minimumDeletions(self, nums: List[int]) -> int:
        mx,mxi=max(nums),-1
        mn,mni=min(nums),-1
        n=len(nums)
        for i in range(len(nums)):
            if nums[i]==mx:
                mxi=i
            elif nums[i]==mn:
                mni=i
        i = min(mxi, mni)
        j = max(mxi, mni)
        front =j+1
        back =n-i
        both =(i +1)+(n- j)
        return min(front,back,both)
        