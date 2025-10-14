//Task3
public class Shelf {
    public int capacity =0;
    public int num = 0;
    public void addBooks(int n){
        if(capacity >num){
            int puran = num;  // num ar old value store
            num = n + num;
            if(capacity>num){
           System.out.println(n+" books added to shelf");
            }else{
                System.out.println("Exceeds capacity");
                num = puran; // puran value e abr boshe jbe cz beshi ta invalid
            }
        }else{
            System.out.println("Zero capacity. Cannot add books. ");
        }
    }
    public void showDetails(){
        System.out.println("Shelf capacity: "+capacity);
        System.out.println("Number of books: "+num);
    }
}
