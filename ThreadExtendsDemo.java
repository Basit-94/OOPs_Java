class EvenThread extends Thread {
    public void run() {
        for(int i=2;i<=10;i=i+2) {
            System.out.println(Thread.currentThread().getName()+" Number : "+i);
            try {
                Thread.sleep(400);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for(int i=1;i<10;i=i+2) {
            System.out.println(Thread.currentThread().getName()+" Number : "+i);
            try {
                Thread.sleep(400);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class ThreadExtendsDemo {
    public static void main(String args[]) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.setName("Even");
        t2.setName("Odd");

        t1.start();
        t2.start();
    }
}