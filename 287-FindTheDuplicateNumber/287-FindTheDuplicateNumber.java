// Last updated: 7/14/2026, 2:14:50 PM
class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val] < 0) return val;
            nums[val] *= -1;
        }
        return -1;
    }
}