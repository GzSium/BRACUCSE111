import java.util.*;
class task9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean b =true;
      //matrix input
      System.out.println("Enter the size of the matrix: ");
      int s = sc.nextInt();
      int [][] mat = new int [s][s];
      System.out.println("Enter the elements of the matrix: ");
      for(int r=0;r<s;r++){
        for(int c=0;c<s;c++){
           mat[r][c]=sc.nextInt();
}
      }
      for(int out=0;out<s;out++){
        for(int in=0;in<s;in++){
            if(out != in && mat[out][in]!=0 ){
                b = false;
                break;
            }else if( out == in && mat[out][in] !=1){
                b = false;
                break;
            }
         }
        if(b == false){
            break;
        }
      }
      if(b == false){
        System.out.println("Not an identity matrix");
      }else{
        System.out.println("Identity matrix");
      }
      sc.close();
   }
}
