# Last updated: 7/14/2026, 2:15:36 PM
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        s=set(nums)
        i=1
        while i in s:
            i+=1
        return i
        