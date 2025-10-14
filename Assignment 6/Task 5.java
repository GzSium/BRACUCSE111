//Task5
public class Borrower {
    public static String book_name [] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};    
    public static int book_count [] = {3,3,3};
    // Book status
    // static variable ke non-static method e use korte parbo na
    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i= 0; i<3;i++){
           System.out.println(book_name[i]+" : "+book_count[i]); 
        }
    }
    // class create
    public String name;
    public Borrower(String n){
        name = n;
    }
    // borrow book
    public int count = 0;
    public String bb [] = new String[3];
    public void borrowBook(String b){
        for(int i=0; i<3;i++){
            // index koto num. a ta jene store kora
            if(book_name[i].equals(b)){
                if(book_count[i]>0){
                        book_count[i]--;
                        bb[count]=b;
                        count++;
                }else{
                        System.out.println("This book is not available. ");
                    }
                }
            }
        }
    //  certain book koita ase
    public static int index;
    public static int remainingBooks(String b){
        for(int i=0; i<3;i++){
            if(book_name[i].equals(b)){
                index = i;
                break;
            }
        }
        return index;
    }
    // details
    public void borrowerDetails(){
        System.out.println("Name:"+name);
        System.out.println("Books Borrowed:");
        for(int i=0;i<count;i++){
            System.out.println(bb[i]);
        }
    }
}

