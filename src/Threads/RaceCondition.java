package Threads;
//A race condition in Java threads occurs when two or more threads access shared data and try to change it simultaneously.
//Because the thread scheduling algorithm can swap between threads at any time, you can't predict the order in which the threads will attempt to access the shared data.
//This can lead to inconsistent or incorrect results.
// e can prevent it by using synchronized method, or synchronized block or by ReentrantLock

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
