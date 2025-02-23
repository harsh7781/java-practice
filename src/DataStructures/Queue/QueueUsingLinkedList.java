package DataStructures.Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueUsingLinkedList {
    Node front, rear;

    // Enqueue Operation
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + data);
    }

    // Dequeue Operation
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow! No elements to dequeue.");
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;
        if (front == null) rear = null; // Reset queue if empty
        return dequeuedData;
    }

    // Peek Operation
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Print Queue
    void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue (front to rear): ");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Output: Queue (front to rear): 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
        queue.printQueue(); // Output: Queue (front to rear): 20 30
    }
}

