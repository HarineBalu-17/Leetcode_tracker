// Last updated: 7/14/2026, 2:14:37 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int x = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                x += i;
            }
        }
        return (num == x) ? true : false;
    }
}