package app;
import model.User;

public class Main {
    public static void main(String[] args) {
        User u = new User();

        // VALID: 'name' is public
        System.out.println("Public field: " + u.name);

        // INVALID (Compile Errors if uncommented):
        // System.out.println(u.role);  // Error: protected (Main is not a subclass of User)
        // System.out.println(u.email); // Error: default (Main is in 'app', not 'model')
        // System.out.println(u.pin);   // Error: private (invisible outside User class)
    }
}