package deletion;

public class Middle1 {
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
            System.out.println("list  is empty:");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // public void delete()

    public static void main(String[] args) {
        Middle1 list = new Middle1();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(10);
        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        // list.printList();
        // System.out.println(list.size);
        int middle = list.size / 2;
        System.out.println(middle);
    }
}
