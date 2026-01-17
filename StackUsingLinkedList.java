public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        Stack() {
            top = null;
        }

        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
            System.out.println("Pushed: " + x);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            Node temp = top;
            System.out.print("Stack elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}