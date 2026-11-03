class EvenThread implements Runnable {
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

class OddThread implements Runnable {
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

public class ThreadImplementDemo {
    public static void main(String args[]) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        
        Thread even = new Thread(t1,"Even");
        Thread odd = new Thread(t2,"Odd");

        even.start();
        odd.start();
    }
}