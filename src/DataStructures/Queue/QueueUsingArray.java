package DataStructures.Queue;

public class QueueUsingArray {
    int front, rear, size, capacity;
    int[] queueArray;

    // Constructor to initialize the queue
    QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    // Check if queue is full
    boolean isFull() {
        return size == capacity;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return size == 0;
    }

    // Enqueue Operation (Add to rear)
    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queueArray[rear] = data;
        size++;
        System.out.println("Enqueued: " + data);
    }

    // Dequeue Operation (Remove from front)
    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No elements to dequeue.");
            return -1;
        }
        int dequeuedData = queueArray[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return dequeuedData;
    }

    // Peek Operation (Front element)
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }

    // Print Queue
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue (front to rear): ");
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5); // Create queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue(); // Output: Queue (front to rear): 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
        queue.printQueue(); // Output: Queue (front to rear): 20 30
    }
}

