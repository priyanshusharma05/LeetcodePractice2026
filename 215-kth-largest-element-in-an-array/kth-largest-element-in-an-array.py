import heapq
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pq=[]
        for i in nums:
            heapq.heappush(pq,i)
        for i in range(len(nums)-k):
            heapq.heappop(pq)
        return heapq.heappop(pq)
