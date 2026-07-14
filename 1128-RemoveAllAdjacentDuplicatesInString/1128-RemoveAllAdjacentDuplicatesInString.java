// Last updated: 7/14/2026, 2:14:25 PM
import java.util.Stack;

public class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.removeDuplicates("abbaca")); // Output: "ca"
        System.out.println(solution.removeDuplicates("azxxzy")); // Output: "ay"
    }
}
