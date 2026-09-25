interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class BasicPrint implements Printable {
    @Override 
    public void print() {
        System.out.println("Print");
    }
}

class AllInOne implements Printable,Scannable {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }
}

public class InterfaceDemo {
    static void performPrint(Printable p) {
        p.print();
    }
    static void performScan(Scannable s) {
        s.scan();
    }

    public static void main(String args[]) {
        BasicPrint bp = new BasicPrint();
        AllInOne al = new AllInOne();
        performPrint(bp);
        performPrint(al);
        performScan(al);
    }
}