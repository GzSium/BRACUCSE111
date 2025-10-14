//Task4
     class Student{
    double cg =0;
    int  id;
    String[] course;
     public Student(int i){
         id =i ;
         System.out.println("A student with ID "+id+" has been created.");
         course = new String[0];
     }
//constructor2
     public Student(int i, double c){
     id = i;
     cg = c;
        if(cg<3){
          course = new String[3];
        }
        else{
          course = new String[4];
        }
     }
//storeID 
     public void storeID(int i){
       id = i;
     }
//storeCG(2.5)
     public void storeCG(double c){
     cg = c;
        if(cg<3){
          course = new String[3];
        }
        else{
          course = new String[4];
        }
     }
//addCourse()
      int count = 0;
      public void addCourse(String c){
        if(cg ==0){
          System.out.println("Failed to add "+c);
          System.out.println("Set CG first");
        }
        else{
           if(count <course.length){
              course[count]= c ;
              count++;
           }
           else{
              if(cg<3){
                  System.out.println("Failed to add "+c);
                  System.out.println("CG is low. Can't add more than 3 courses.");
              }
                else{
                  System.out.println("Failed to add "+c);
                  System.out.println("Maximum 4 courses allowed.");
              }
           }
        }
      }
// addCourse
      public void addCourse(String [] c){
       if(cg ==0){      
         System.out.println("Failed to add "+c);   
         System.out.println("Set CG first"); 
        } 
    int k =0;
    while(k<course.length){ 
         if(k<course.length){ 
             course[k]=c[k];
              k++;  
         }
          else{  
             if(cg<3){
                System.out.println("Failed to add "+c);
                System.out.println("CG is low. Can't add more than 3 courses."); 
            }  
              else{   
                 System.out.println("Failed to add "+c);
                 System.out.println("Maximum 4 courses allowed.");  
              } 
            }
        }
       }
  //removeAllCourse();
         public void removeAllCourse(){
             for(int j = 0;j<count;j++){
                course[j] = null;
             }
             count = 0;
         }
  //advise
         public void showAdvisee(){
             System.out.println("Student ID: "+id+",  CGPA: "+cg);
             System.out.println("Added courses are: ");
             if(count == 0){
              System.out.println("No courses added. ");
             }
             else{
             for(int m =0; m<count;m++){
                 System.out.println(course[m]+" ");
             }
          }
        }
     }

