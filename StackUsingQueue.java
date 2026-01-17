import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            System.out.println("Pushed: " + x);
        }

        public int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return q1.remove();
        }

        public int peek() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        public void display() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements: ");
            for (int val : q1) {
                System.out.print(val + " ");
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