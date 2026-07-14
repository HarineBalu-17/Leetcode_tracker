# Last updated: 7/14/2026, 2:14:33 PM
class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        return len(s) == len(goal) and goal in (s+s)