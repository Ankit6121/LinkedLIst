public class DLL1 {
    Node head;
    private int size = 0;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }

    public void Infront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;

        }
        head = newNode;

    }

    public void AddBefore(int data, int indexdata) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.data != indexdata) {
            currNode = currNode.next;
        }
        newNode.prev = currNode.prev;
        currNode.prev = newNode;
        newNode.next = currNode;
        if (newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;

    }

    public void ListPrint() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void addAfter(int data, int indexdata) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.data != indexdata) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        newNode.prev = currNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next = null;
    }

    public static void main(String[] args) {
        DLL1 list = new DLL1();
        list.Infront(10);
        list.Infront(1);
        list.Infront(12);
        list.ListPrint();
        list.AddBefore(100, 10);
        System.out.println();
        list.ListPrint();
        System.out.println();
        list.addAfter(50, 10);
        list.ListPrint();
        System.out.println();
        list.addLast(200);
        list.ListPrint();
    }
}
