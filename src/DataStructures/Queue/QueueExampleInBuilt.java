package DataStructures.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleInBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10); // Enqueue
        queue.add(20);
        queue.add(30);

        System.out.println("Front Element: " + queue.peek()); // Output: 10
        System.out.println("Dequeued: " + queue.poll()); // Output: 10
        System.out.println("Queue: " + queue); // Output: [20, 30]
    }
}

