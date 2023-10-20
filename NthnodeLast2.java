public class NthnodeLast2 {
    Node head;
    private int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    public Node getNode(int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        NthnodeLast2 list = new NthnodeLast2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        Node temp = list.getNode(2);
        System.out.println(temp.data);
    }
}
