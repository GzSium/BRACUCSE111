//Task4
public class Circle {
    private double radius;
    public static int count = 0;
    //method 1
    public double getRadius(){
        return radius;
    }
    //method 2 
    public double area(){
        double a= 3.1416*radius*radius;
        return a;
    }
    //mathod 3
    public void setRadius(double r){
        radius = r;
    }
    //class 1
    public Circle(double r){
        setRadius(r);
        count++;
    }
}

