public class DequeImplementation {
    static class Deque {
        int[] arr;
        int front, rear, size, capacity;

        Deque(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = -1;
            rear = 0;
            size = 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void insertFront(int x) {
            if (isFull()) {
                System.out.println("Deque Overflow at Front");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else {
                front = (front - 1 + capacity) % capacity;
            }
            arr[front] = x;
            size++;
            System.out.println("Inserted at Front: " + x);
        }

        public void insertRear(int x) {
            if (isFull()) {
                System.out.println("Deque Overflow at Rear");
                return;
            }
            if (front == -1) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % capacity;
            }
            arr[rear] = x;
            size++;
            System.out.println("Inserted at Rear: " + x);
        }

        public int deleteFront() {
            if (isEmpty()) {
                System.out.println("Deque Underflow at Front");
                return -1;
            }
            int item = arr[front];
            front = (front + 1) % capacity;
            size--;
            return item;
        }

        public int deleteRear() {
            if (isEmpty()) {
                System.out.println("Deque Underflow at Rear");
                return -1;
            }
            int item = arr[rear];
            rear = (rear - 1 + capacity) % capacity;
            size--;
            return item;
        }

        public int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return arr[front];
        }

        public int getRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return arr[rear];
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return;
            }
            System.out.print("Deque elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deque dq = new Deque(5);

        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertFront(2);
        dq.display();

        System.out.println("Front: " + dq.getFront());
        System.out.println("Rear: " + dq.getRear());

        System.out.println("Deleted Front: " + dq.deleteFront());
        dq.display();

        System.out.println("Deleted Rear: " + dq.deleteRear());
        dq.display();

        dq.insertRear(30);
        dq.insertFront(40);
        dq.display();
    }
}