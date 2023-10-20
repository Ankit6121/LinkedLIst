
// find the nth node of the linked list form the last and delete node 
class LL2 {
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

    public int getSize() {
        return size;
    }

    public void printlist() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(head.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        // System.out.println(list.getSize());
        // print the linkedlist
        list.printlist();

    }
}