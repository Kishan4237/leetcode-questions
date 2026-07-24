import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing brackets
            else {

                // Stack empty hai, to matching opening bracket nahi mila
                if (stack.isEmpty()) {
                    return false;
                }

                // Top opening bracket nikalo
                char top = stack.pop();

                // Matching check
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Agar stack empty hai to saare brackets match ho gaye
        return stack.isEmpty();
    }
}