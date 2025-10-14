//Task8
public class Reader {
    int capacity;
    String name;
    String [] book;
    public String createReader(String n, int c){
        name = n;
        capacity = c;
        book = new String[capacity];
        String s1 = "A new reader is created !" ;
        return s1;
    }
    int count = 0;
    public void addBook(String b){
     if(count<capacity){
        book[count]= b;
        count++;
     }else{
        System.out.println("No more capacity");
     }
    }
public void readerInfo(){
    System.out.println("Name: "+name);
    System.out.println("Capacity: "+capacity);
    System.out.println("Books: ");
    int no = 1;
    if(count == 0){
        System.out.println("No books added yet");
    }else{
    for(int i =0;i<count;i++){
       System.out.println("Book "+no+": "+book[i]);
       no++;
    }
    }
}
}
