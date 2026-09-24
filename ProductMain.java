class Product
{
    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price,int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name,double price)
    {
        this(name, price, 1);
    }
    public Product(String name)
    {
        this(name, 0.0);
    }

    public void applyDiscount(double flatOff)
    {
        price = price-flatOff;
    }
    public void applyDiscount(int percentage)
    {
        price = price - (price*percentage)/100;
    }

    public void printDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
    }
}

public class ProductMain
{
    public static void main(String args[])
    {
        Product p1 = new Product("Laptop", 50000.0, 2);
        Product p2 = new Product("Headphones", 2000.0);
        Product p3 = new Product("Free Sticker");

        p1.applyDiscount(5000.0);
        p2.applyDiscount(10);

        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
    }
}