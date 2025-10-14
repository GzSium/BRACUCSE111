//Task1
public class BankAccount{
    // setInfo  printDetails
    public int no = 0;
    public String typ = "Not Set";
    public void setInfo(int n,String t){
no = n;
typ = t;
System.out.println("Account information updated! ");
    }
public String printDetails(){
 String s1 = "Account No: " + no + "\nType: " + typ ;
// String s2 = "\nType: " + typ;
 // return s1 + s2 ;
 return  s1;
}
}
