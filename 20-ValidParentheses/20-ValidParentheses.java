// Last updated: 7/14/2026, 2:15:48 PM
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Handle closing brackets
            else {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If the stack is empty, all brackets matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.isValid("()"));       // Output: true
        System.out.println(solution.isValid("()[]{}"));   // Output: true
        System.out.println(solution.isValid("(]"));       // Output: false
        System.out.println(solution.isValid("([)]"));     // Output: false
        System.out.println(solution.isValid("{[]}"));     // Output: true
    }
}
