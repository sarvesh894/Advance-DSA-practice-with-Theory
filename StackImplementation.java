public class StackImplementation {
    static class Stack {
        int[] arr;
        int top;
        int capacity;

        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
            System.out.println("Pushed: " + x);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public int size() {
            return top + 1;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        stack.display();

        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full: " + stack.isFull());
        System.out.println("Size: " + stack.size());
    }
}