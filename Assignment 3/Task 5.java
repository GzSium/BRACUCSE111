
//Task5
public class TaxiLagbe {
    // addPassenger method overloading,, println() method 
    String num ;
    String area;
    int sum = 0 ;
    int indx = 0;
    String [] name = new String [4];
    public void storeInfo(String n, String a){
        num = n;
        area = a;
    }
    public void addPassenger(String p, int t){
        System.out.println("Dear "+p+"! Welcome to TaxiLagbe");
        if(indx<4){
        name[indx] = p;
        sum = sum + t;
        indx++;
        }else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void addPassenger(String p, int t, String p1, int t1){
        if(indx<4){      //if 1
           System.out.println("Dear "+p+"! Welcome to TaxiLagbe");
           name[indx++] = p;
           sum = sum + t ;
        }if(indx<4){       //if 2
            System.out.println("Dear "+p1+"! Welcome to TaxiLagbe");
            name[indx++] = p1;
            sum = sum + t1 ;
        }else{
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }
    public void printDetails(){
          System.out.println("Taxi number: "+num);
          System.out.println("This area can cover "+area+" area");
          System.out.println("Total Passenger: "+indx);
          System.out.println("Passenger list: ");
          for(int i =0;i<indx;i++){
            System.out.print(name[i]+" ");
          }
          System.out.println();
          System.out.println("Total collected fare: "+sum+" Taka");
          
    }
}

