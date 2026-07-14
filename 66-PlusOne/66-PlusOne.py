# Last updated: 7/14/2026, 2:15:32 PM
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num=0
        L=[]
        for i in digits:
            num=num*10+i
        num=num+1
        while(num>0):
            a=num%10
            num=num//10
            L.insert(0,a)
        return L