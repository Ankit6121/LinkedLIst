public class NthNodeFromLast {
    public static Node ntNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        int x = size - n + 1;
        for (int i = 1; i <= x - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = ntNode(a, 3);
        System.out.println(temp.data);

    }
}
