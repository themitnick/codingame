import java.util.ArrayDeque;
import java.util.Deque;

public class IsValid {

    static void main() {
        IsValid app = new IsValid();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";
        System.out.println(app.isValid(test1)); // true
        System.out.println(app.isValid(test2)); // true
        System.out.println(app.isValid(test3)); // false
        System.out.println(app.isValid2(test4)); // false
        System.out.println(app.isValid2(test5)); // true
    }

    public boolean isValid(String s) {
        // Check if the string is valid
        // A string is valid if all open brackets are closed by the same type of brackets
        // and in the correct order
        // Use a stack to keep track of open brackets
        // When we see a closing bracket, we check if it matches the top of the stack
        // If it does, we pop the stack, otherwise we return false
        // At the end, if the stack is empty, we return true, otherwise false

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
