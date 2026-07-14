// Last updated: 7/14/2026, 2:14:32 PM
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        return buildString(S).equals(buildString(T));
    }

    private String buildString(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
