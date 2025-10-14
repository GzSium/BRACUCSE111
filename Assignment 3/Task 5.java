//Task4
public class Library {
    int count = 0;
    int cap ;                                   //atribute amneo lekha jai
    public String [] name;                           
    public void setBookCapacity(int i ){      // i method ar part method ar baire kj krbe na
     name = new String[i];                    // array initialize ar pr evabe indexdeclear krte hy
    cap = i;
    }
    public void addBook(String n){
        if(count < cap){
        name[count] = n;
        count++;
        System.out.println("Book '"+n+"' added to the library");
        }else{
        System.out.println("Maximum capacity exceeds. You can't add more than "+cap+" books");
        }
    }
    public void printDetail(){
        System.out.println("Maximum Capacity: "+cap);
        System.out.println("Total Books: "+count);
        System.out.println("Book list: ");
        for(int m = 0; m< count;m++){
            System.out.println(name[m]);
        }
    }
}
