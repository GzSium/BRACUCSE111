public class Course{
    public String a;
    public String b;
    public int c;
    public void updateDetails(String i, String j, int k){
        a = i;
        b=j;
        c=k;
    }
    public void displayCourse(){
        System.out.println("Course Name: ");
        System.out.println(a);
        System.out.println("Course Code: "+b);
        System.out.println("Course credit: "+c);
    }
}

