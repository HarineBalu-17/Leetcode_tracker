// Last updated: 7/14/2026, 2:15:29 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;

        int low = 0;
        int high = n * m - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            int i = mid / m;
            int j = mid % m;

            if (target == arr[i][j]) {
                return true;
            } else if (target < arr[i][j]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}