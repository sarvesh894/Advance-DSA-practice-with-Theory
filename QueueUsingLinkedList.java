public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        Queue() {
            front = rear = null;
        }

        public void enqueue(int x) {
            Node newNode = new Node(x);
            if (rear == null) {
                front = rear = newNode;
                System.out.println("Enqueued: " + x);
                return;
            }
            rear.next = newNode;
            rear = newNode;
            System.out.println("Enqueued: " + x);
        }

        public int dequeue() {
            if (front == null) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return value;
        }

        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            System.out.print("Queue elements: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        System.out.println("Is Empty: " + queue.isEmpty());
    }
}