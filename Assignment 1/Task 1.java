import java.util.*;
class t1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    double sum =0;
    int max =0;
    int min =0;
    double avg;
    double count = 0;
    // loop 
    for(int i=0;i<10;i++){
        int num = sc.nextInt();
        if(num>0 && num%2 !=0){
      if(num>max){
        max= num;
      }
      //  prothom odd ke min value count
      if(num<min ||i == 0){
        min = num;
      }
        sum = sum+num;
        count++;
    }
  }
 // no count means it didn't find any odd number
    if(count == 0) {
      System.out.println("No odd positive numbers found.");
    }else{
    // convert double to int 
    int convertSum = (int)sum ;
    System.out.println("Sum: "+convertSum);
    System.out.println("Maximum:"+max);
    System.out.println("Minimum: "+min);
    avg = sum / count;
    System.out.println("Average: "+avg);
    sc.close();
    }
  }
}
