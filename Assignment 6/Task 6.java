//Task6

public class Cargo {
    int index = i;
    // load() = select & unload() to unmarked & capacity 10 
    // detail()= print name & weight  
    public static double capacity = 10;
    // method capacity
    public static double capacity() {
        return capacity;
    }
    // class 
    String name;
    double weight;
    public Cargo(String n, double w){
        name = n;
        weight = w;
        i++;
    }
    // details method
    public  boolean b= false;
    public static int i =1;
    public void details(){
        System.out.println("Cargo ID: "+index+", Content: "+name+", Weight: "+weight+", Loaded:"+b);
    }
    // load method
    public void load(){
        // capacity ke weight ar sthe tulona na dile 3 num. tao load hye jai jeta uchit na
        if(capacity > weight){
        if(b == false){
            b = true;
            capacity = capacity - weight;
            System.out.println("Cargo "+index+" loaded for transport.");
        }
        }else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
       }
    }
    // unload method
    public void unload(){
        if(b == true){
            b = false;
            capacity = capacity + weight;
            System.out.println("Cargo "+index+" unloaded.");
        }
    }
}
