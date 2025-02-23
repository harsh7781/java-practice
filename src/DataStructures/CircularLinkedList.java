package DataStructures;

class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    CNode head;

    // Insert at end
    public void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Circular connection
            return;
        }
        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    // Print Circular List
    public void display() {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(" (Back to Head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display(); // Output: 10 → 20 → 30 → (Back to Head)
    }
}

