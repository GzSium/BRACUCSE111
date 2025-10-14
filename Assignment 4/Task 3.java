//Task3
public class Shape2D {
    String name = "Square" ;
    int length = 5;
    double area;
    public Shape2D(){
         System.out.println("A Square has been created with");
         System.out.println("length: "+length);
          area = length*length;
    }
    public Shape2D(int l, int b){
        name = "Rectangle";
        System.out.println("A "+name+"  has been created with");
        System.out.println("length: "+l+" and breadth: "+b);
        area = l*b;
   }
   public Shape2D(int l, int b, String n){
    name = n;
    System.out.println("A "+name+"  has been created with");
    System.out.println("height: "+l+" and ase: "+b);
    area = 0.5*l*b;
}
public Shape2D(int l, int b, int n){
    name = "Triangle";
    System.out.println("A "+name+"  has been created with");
    System.out.println("the following sides: "+l+","+b+","+n);
    double s = (l+b+n)/2 ;
    double a = s*(s-l)*(s-b)*(s-n);
    area = Math.sqrt(a);
}
public void area(){
    System.out.println("The area of the "+name+" is: "+area);
}
}
