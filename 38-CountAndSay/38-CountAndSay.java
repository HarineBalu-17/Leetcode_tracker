// Last updated: 7/14/2026, 2:15:38 PM
class Solution {
    public String count(int n, String a) {
        if(n == 1) return a;
        Map<Character, Integer> map = new HashMap<>();
        char prev = a.charAt(0);
        StringBuilder sb = new StringBuilder();
        int point = 1, count = 1;
        while(point < a.length()) {
            if(prev != a.charAt(point)) {
                sb.append(count).append(prev);
                count = 1;
            }
            else count++;
            prev = a.charAt(point);
            point++;
        }
        sb.append(count).append(prev);
        return count(n - 1, sb.toString());

    }
    public String countAndSay(int n) {
        return count(n, "1");
    }
}