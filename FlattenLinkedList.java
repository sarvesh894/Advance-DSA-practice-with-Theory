public class FlattenLinkedList {
    static class Node {
        int data;
        Node next;
        Node down;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.down = null;
        }
    }

    Node head;

    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.down = merge(a.down, b);
            return a;
        } else {
            b.down = merge(a, b.down);
            return b;
        }
    }

    public Node flatten(Node root) {
        if (root == null || root.next == null) return root;
        root.next = flatten(root.next);
        root = merge(root, root.next);
        return root;
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlattenLinkedList list = new FlattenLinkedList();

        list.head = new Node(5);
        list.head.down = new Node(7);
        list.head.down.down = new Node(8);
        list.head.down.down.down = new Node(30);

        list.head.next = new Node(10);
        list.head.next.down = new Node(20);

        list.head.next.next = new Node(19);
        list.head.next.next.down = new Node(22);
        list.head.next.next.down.down = new Node(50);

        list.head.next.next.next = new Node(28);
        list.head.next.next.next.down = new Node(35);
        list.head.next.next.next.down.down = new Node(40);
        list.head.next.next.next.down.down.down = new Node(45);

        Node flatHead = list.flatten(list.head);
        list.printList(flatHead);
    }
}