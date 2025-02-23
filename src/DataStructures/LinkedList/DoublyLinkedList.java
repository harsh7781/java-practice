package DataStructures.LinkedList;

class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DoublyLinkedList {
    DNode head;

    // Insert at end
    public void insert(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print Forward
    public void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ↔ ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.displayForward(); // Output: 10 ↔ 20 ↔ 30 ↔ NULL
    }
}

