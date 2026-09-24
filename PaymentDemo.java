abstract class Payment {
    String transactionId;
    double amount;

    public Payment(String transactionId,double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    void printReceipt() {
        System.out.println("Transaction Id : "+transactionId);
        System.out.println("Amount : "+amount);
    }

    abstract void processPayment();
}

class UPIPayment extends Payment {
    String upiId;
    public UPIPayment(String transactionId,double amount,String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override 
    void processPayment() {
        System.out.println("Payment Proccessed through : "+upiId);
    }
}

class CardPayment extends Payment {
    String cardNumber;
    public CardPayment(String transactionId,double amount,String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override 
    void processPayment() {
        System.out.println("Payment Proccessed through : "+cardNumber);
    }
}

public class PaymentDemo {
    static void executeTransaction(Payment p) {
        p.printReceipt();
        p.processPayment();
    }
    public static void main(String args[]) {
        Payment pay = new UPIPayment("absg", 10000, "122344567");
        Payment payment = new CardPayment("abshsh", 11000, "56866786");

        executeTransaction(pay);
        executeTransaction(payment);
    }
}
