public class DeleteAtFirst {
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
        Node currNode = head;
        while (currNode.next != null) {

            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtFirst list = new DeleteAtFirst();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.printList();
    }
}
