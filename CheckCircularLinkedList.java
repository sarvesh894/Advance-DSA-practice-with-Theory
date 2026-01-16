public class CheckCircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean isCircular() {
        if (head == null) return false;
        Node temp = head.next;
        while (temp != null && temp != head) {
            temp = temp.next;
        }
        return temp == head;
    }

    public static void main(String[] args) {
        CheckCircularLinkedList list = new CheckCircularLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("Is circular: " + list.isCircular());

        list.head.next.next.next = list.head;
        System.out.println("Is circular: " + list.isCircular());
    }
}