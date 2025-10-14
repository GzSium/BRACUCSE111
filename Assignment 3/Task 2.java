//Task2 
public class Shape {
    // method overloading setParameters,, details() Strign return 
    public String name;
    public double area;
    public void setParameters(String n, int r){
        name = n;
        area = 3.1416*r*r;
    }
    public void setParameters(String n, int lombo, int vumi){
        name = n;
        area = 0.5*lombo*vumi;
    }
    public void setParameters(String n, double l, double w){
        name = n;
        area = l*w;
    }
    public String details(){
        String s1 = "Shape Name: " + name + "\nArea: " + area;  //  \n command "" ar moddhe hbe 
        return s1 ;
    }
}
