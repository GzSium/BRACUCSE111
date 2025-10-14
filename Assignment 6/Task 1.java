//Task1
public class Product {
    private String name;
    private double price;
    private int quant;
    public Product(){
        name = "Unknown";
        price = 0.0;
    }
    public void displayInfo() {
        System.out.println("Product Name: "+name);
        System.out.println("Price: $"+price);
    }
    public Product(String n, double p){
        name = n;
        price = p;
    }
    public void setQuantity(int q){
        quant = q;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quant;
    }
    public void displayInfo(boolean x){
        System.out.println("Product Name: "+name);
        System.out.println("Price: $"+price);
        System.out.println("Quantity: "+quant);
    }
}

