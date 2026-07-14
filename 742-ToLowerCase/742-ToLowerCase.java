// Last updated: 7/14/2026, 2:14:35 PM
class Solution {
    public String toLowerCase(String s) {
       StringBuilder result = new StringBuilder();

for (char c : s.toCharArray()) {
    if (c >= 'A' && c <= 'Z') {
        result.append((char)(c + 32)); 
    } else {
        result.append(c);
    }
}

return result.toString();

    }
}