//Task2
public class Toy {
    String name;
    int price;
    public Toy(String n, int i){
       name = n;
       price = i;
       System.out.println("A new toy has been made!");
    }
    public void updatePrice(int j){
        price = j;
    }
    public void updateName(String na){
        name = na;
    }
    public void showPrice(){
        System.out.println("price: "+price+" Taka");
    }
}
