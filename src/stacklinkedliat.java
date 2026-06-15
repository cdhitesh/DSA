public class stacklinkedliat {

    // Node class to represent each element in the stack
    static class Node {
        int data;
        Node next;

        // Constructor for node initialization
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Stack class to handle stack operations
    static class Stack {
        private Node head = null;  // Top of the stack

        // Check if the stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push an element onto the stack
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop the top element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return head.data;
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
