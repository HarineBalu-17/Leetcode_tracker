// Last updated: 7/14/2026, 2:14:36 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i:nums)
        {
            totalSum+=i;
        }
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            int right=totalSum-left-nums[i];
            if(right==left)
            {
                return i;
            }
            left+=nums[i];
        }
        return-1;
    }
}









                                                                                                         