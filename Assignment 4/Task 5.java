
//Task5
public class Triangle{
    String type;
    int side1,side2,side3;
    int p ;
//updateSide()
    public void updateSides(int a, int b, int c){
        side1 = a;
        side2 = b;
        side3 = c;
    }
// details
public void triangleDetails(){
    System.out.println("Three sides of the triangle are: "+side1+","+side2+","+side3);
     p = side1+ side2+ side3 ;
    System.out.println("Perimeter: "+p);
}
// return type
public String printTriangleType(){
    if(side1==side2 && side2==side3){
        type = "Equilateral Triangle." ;
    }
    else if(side1==side2 || side2==side3){
        type = "Isosceles Triangle."; 
    }
    else{
        type = "Scalene Triangle.";
    }
    String s1 = "This is a " + type;
    return s1;
}
// object compare  obejct nile obj ar name thake age ,means string int lekhar jaigai o thake
public void compareTrinagles(Triangle t){
      // == location check dibe
      if(this == t){
        System.out.println("These two triangle objects have the same address.");
      }
      else if(this.side1==t.side1 && this.side2==t.side2 && this.side3==t.side3){
        System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
      else if (this.p == t.p){
        System.out.println("Only the perimeter of both triangles is equal.");
      }
      else{
        System.out.println("Addresses, length of the sides and perimeter all are different.");
      }
}
}
