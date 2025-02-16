package Threads;
//I want to use two objects simultaneously or parallely
//Every thread must contain run method

class MultiThreading1 extends Thread{
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("running m1");
        }
    }
}

class MultiThreading2 extends Thread{
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("running m2");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MultiThreading1 obj1 = new MultiThreading1();
        MultiThreading2 obj2 = new MultiThreading2();

        obj1.start();
        obj2.start();
    }

}
