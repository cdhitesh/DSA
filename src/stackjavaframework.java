import java.util.Stack;

public class stackjavaframework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();  // Correct Stack class usage

        s.push(1);
        s.push(2);
        s.push(3);

        // Use correct method calls for isEmpty and pop
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

