
//Task6
public class Student {
    String name ="Not Set";
    String dep =  "CSE";
    double cg = 0;
    int credit = 9;
    String scholar = "Not Set";
    public void updateDetails(String n, double c, int cre){
         name = n;
         cg =c;
         credit = cre;
    }
    public void updateDetails(String n, double c, int cre, String d){
        name = n;
        cg =c;
        credit = cre;
        dep = d;
   }
   public void updateDetails(String n, double c){
    name = n;
    cg =c;
}
   public void checkScholarshipEligibility(){
    if(cg>=3.5 && credit>10){
          if(cg>=3.5 && cg<3.7){
            scholar = "Need-based scholarship";
            System.out.println(name+" is eligible for "+scholar);
          }
          if(cg>=3.7){
            scholar = "Merit-based scholarship";
            System.out.println(name+" is eligible for "+scholar);
          }
    }else{
        scholar = "No scholarship";
        System.out.println(name+" is not eligible for scholarship");
    }
   }
   public void showDetails(){
         System.out.println("Name: "+name);
         System.out.println("Department: "+dep);
         System.out.println("CGPA: "+cg);
         System.out.println("Credir:"+credit);
         System.out.println("Scholarship Status: "+scholar);
   }
}
