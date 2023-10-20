public class LL3 {
    Node head;
    private int size = 0;

    class Node {
        int value;
        Node next;

        Node(int data) {
            value = data;
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
        while (currNode != null) {
            System.out.print(currNode.value + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public int findIndex(int data) {
        Node currNode = head;
        int index = 0;
        while (currNode.value != data) {
            index = index + 1;
            currNode = currNode.next;
        }
        return index;
    }

    public int findNode(int index) {
        Node currNode = head;
        int count = 0;
        while (count != index) {
            currNode = currNode.next;
            count = count + 1;
        }
        return currNode.value;
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.addFirst(12);
        list.addFirst(12);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(13);
        list.addFirst(100);
        list.addLast(10);
        // list.printList();
        // find the node the index
        System.out.println(list.findIndex(45));
        System.out.println(list.findNode(2));
    }
}
