import java.util.Stack;

public class ValidParenthese {
    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            // For closing brackets
            else {
                if (s.isEmpty()) {
                    return false;  // Closing bracket without a corresponding opening bracket
                }
                char top = s.peek();

                // Check if the top of the stack matches the current closing bracket
                if ((top == '(' && ch == ')')
                        || (top == '{' && ch == '}')
                        || (top == '[' && ch == ']')) {
                    s.pop();  // Pop if it's a valid match
                } else {
                    return false;  // Mismatch found
                }
            }
        }

        // At the end, if the stack is empty, it's valid
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({[]})";
        if (isvalid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }
}

