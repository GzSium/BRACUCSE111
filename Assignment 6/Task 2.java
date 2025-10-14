//Task2
public class Passenger {
  public static int no_of_passenger = 0;
  public static double total_fare = 0.0;
    // no_of_passenger() return method
    // total_fare() return method
    public int no_of_passenger(){
        return no_of_passenger ;
    }
    public double total_fare(){
        return total_fare;
    }
  public String name ;
  public double fare;
    public Passenger(String n, double d){
        name = n;
        fare = 20*d;
        no_of_passenger++;
        total_fare = total_fare + fare ;
    }
    public void storeBaggageWeight(double w){
        fare = fare + 10*w;
        total_fare = total_fare + fare;
    }
    public void passengerDetails(){
        System.out.println("Name: "+name);
        System.out.println("Fare:"+fare+" TK");
    }
}
