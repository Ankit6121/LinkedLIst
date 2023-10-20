import java.util.*;

public class User1 {
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

    public void PrintList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void DeleteItem() {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data > 50) {
                currNode.data = currNode.next.data;
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        User1 list = new User1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the how many element you want to entered! ");
        int n = sc.nextInt();
        System.out.println("enter the element of the linked list!");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.addFirst(num);
        }
        list.DeleteItem();
        list.PrintList();

    }
}
