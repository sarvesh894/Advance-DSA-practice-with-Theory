import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    static class MyQueue {
        private Queue<Integer> q;

        MyQueue() {
            q = new LinkedList<>();
        }

        public void enqueue(int x) {
            q.add(x);
            System.out.println("Enqueued: " + x);
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return q.remove();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return q.peek();
        }

        public boolean isEmpty() {
            return q.isEmpty();
        }

        public int size() {
            return q.size();
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int val : q) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}