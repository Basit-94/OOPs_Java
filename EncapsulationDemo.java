import java.util.Scanner;
class UserAccount {
    private final String accountId;
    private String email;
    private double balance;
    
    UserAccount(String accountId,String email,double balance) {
        this.accountId = accountId;
        setEmail(email);
        setBalance(balance);
    }

    public String getAccountId() {
        return accountId;
    }

    public final void setBalance(double balance) {
        if(balance>0) {
            this.balance = balance;
            return;
        }
        System.out.println("Balance can't be negative");
    }
    public double getBalance() {
        return balance;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email.contains("@") && email.contains(".")) {
            this.email = email;
            return;
        }
        System.out.println("Invalid Email");
    }
}

public class EncapsulationDemo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Account ID,Email,Balance");
        String accountId = in.next();
        String email = in.next();
        double balance = in.nextDouble();
        UserAccount userAccount = new UserAccount(accountId, email, balance);
    }
}
