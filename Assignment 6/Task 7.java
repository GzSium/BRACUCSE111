//Task7
public class Student {
    public static int cse = 0;
    public static int other =0;
    public static int total =0;
    // class 
    public String name;
    public double cg;
    public String dept ="CSE";
    public Student(String n, double c){
        name = n;
        cg= c;
        cse++;
        total++;
    }
    // class 2
    public Student(String n, double c, String d){
        name = n;
        cg= c;
        dept = d;
        other++;
        total++;
    }
    public void individualDetail(){
        System.out.println("ID:"+total);
        System.out.println("Name: "+name);
        System.out.println("CGPS: "+cg);
        System.out.println("Department: "+dept);
    }
    public static void printDetails(){
        System.out.println("Total Student(s): "+total);
        System.out.println("CSE Student(s):"+cse);
        System.out.println("Other Student(s): "+other);
    }
}
