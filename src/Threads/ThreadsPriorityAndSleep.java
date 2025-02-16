package Threads;
//I want to use two objects simultaneously or parallely
//Every thread must contain run method

class MT1 extends Thread{
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("running m1");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MT2 extends Thread{
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("running m2");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsPriorityAndSleep {
    public static void main(String[] args) throws InterruptedException {
        MT1 obj1 = new MT1();
        MT2 obj2 = new MT2();

//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(obj1.getPriority());

        obj1.start();
        Thread.sleep(5);
        obj2.start();
    }

}

