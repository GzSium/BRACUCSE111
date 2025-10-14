//Task6

public class Course {
    String course;
    public Course(String name){
        course = name;
    }
}



public class Teacher {
    String name;
    String ini;
    String[] courselist = new String[3];
// constructor
    public Teacher(String n, String i){
        name = n;
        ini = i;
        System.out.println("A new teacher has been created");
    }
// array course ar jnno
int count = 0;
    public void addCourse(Course x){
       if(count < 3){
         courselist[count] = x.course ;
         count++;
       }
    }
// detail
public void printDetail(){
    System.out.println("Name: "+name);
    System.out.println("Initial: "+ini);
    System.out.println("List of courses: ");
    for(int i=0;i<=count;i++){
        System.out.println(courselist[i]);
    }
}
}
