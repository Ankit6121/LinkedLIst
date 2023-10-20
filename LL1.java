class LL1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(head.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.printList();

    }
}