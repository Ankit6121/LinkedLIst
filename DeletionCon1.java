package deletion;

import java.util.*;

public class DeletionCon1 {
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

    public void delete() {
        if (head == null) {
            return;
        }

    }

    public static void main(String[] args) {
        DeletionCon1 list = new DeletionCon1();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many element in the list");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            list.addFirst(number);
        }
        // list.delete();
        list.printList();
    }
}
