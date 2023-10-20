public class Deletion1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node flag = head;
        while (flag.next != null) {
            System.out.print(flag.data + "->");
            flag = flag.next;
        }
        System.out.println("null");
    }

    public void DeleteAtFirst() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void DeleteAtLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }
        second_last.next = null;
    }

    public static void main(String[] args) {
        Deletion1 list = new Deletion1();
        list.addFirst(1);

        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.printList();
        // list.DeleteAtFirst();
        // System.out.println("list after deletion");
        // list.printList();
        list.DeleteAtLast();
        list.printList();
    }
}
