package model;

public class User {
    public String name = "Alex";      // Accessible everywhere
    protected String role = "Admin";  // Accessible in model + any subclass
    String email = "alex@test.com";   // Default: Accessible ONLY inside 'model' folder
    private String pin = "1234";      // Accessible ONLY inside User class
}
