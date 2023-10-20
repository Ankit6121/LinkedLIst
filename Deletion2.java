public class Deletion2 {
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

    public void delete(int index) {
        Node currNode = head;
        Node previous = null;
        if (index < 1 || index > size) {
            System.out.println("invalid indexing:");
        }
        while (index > 0) {
            previous = currNode;
            currNode = currNode.next;
            index--;
        }
        previous.next = currNode.next;
    }

    public static void main(String[] args) {
        Deletion2 list = new Deletion2();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        // System.out.println(list.size);
        list.delete(2);
        list.printList();

    }
}
