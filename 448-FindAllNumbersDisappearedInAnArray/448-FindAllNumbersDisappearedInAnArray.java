// Last updated: 7/14/2026, 2:14:41 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int x = Math.abs(arr[i]) - 1;  // fix here
            if (arr[x] > 0) {
                arr[x] = -arr[x];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}