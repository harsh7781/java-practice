package Threads;

//class M1 implements Runnable{
//    public void run() {
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("running m1");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class M2 implements Runnable{
//    public void run() {
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("running m2");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("running m1");
                    try { Thread.sleep(10);} catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };
        Runnable obj2 = () -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("running m2");
                try { Thread.sleep(10);} catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}

