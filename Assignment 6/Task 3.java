//Task3
public class Book {
    public static int total_books_sold = 0;
    public static double total_revenue = 0.0;
    public String name;
    public double price;
    public Book(){
        price = 150;
        total_revenue = total_revenue + price;
        total_books_sold++;
    }
    public Book(String n, int d){
        name = n;
        price = 150;
        discount(d);
        total_revenue = total_revenue + price;
        total_books_sold++;
    }
    public void bookDetails(){
        System.out.println("Title: "+name);
        System.out.println("Price after discount: "+price+" TK");
    }
    // method for discount calculation
    public void discount(int d){
        price = price - price*(d/100.0);
    }
}

