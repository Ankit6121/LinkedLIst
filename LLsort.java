public class LLsort {
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

    public void ListPrint() {
        Node currNode = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public void sortList() {
        Node currNode = head;
        Node index = null;
        int temp = 0;
        if (head == null) {
            return;
        }
        while (currNode != null) {
            index = currNode.next;
            while (index != null) {
                if (currNode.data > index.data) {
                    temp = currNode.data;
                    currNode.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LLsort list = new LLsort();
        list.addFirst(23);
        list.addFirst(22);
        list.addFirst(100);
        list.addFirst(2);
        list.addFirst(25);
        list.ListPrint();
        System.out.println("after sorting");
        list.sortList();
        list.ListPrint();
    }
}
