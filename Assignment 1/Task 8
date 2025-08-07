import java.util.*;
class task8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Row: ");
      int r =sc.nextInt();
      System.out.println("column: ");
      int c = sc.nextInt();
      int [][] arr2d = new int [r][c];
      for(int i=0;i<r;i++){
        for(int j =0;j<c;j++){
            arr2d[i][j]= sc.nextInt();
        }
      }
      System.out.println("2D Array: ");
      for(int out=0; out<r;out++){
        for(int in=0;in<c;in++){
            System.out.print(arr2d[out][in]+" ");
        }
             System.out.println();
      }
     System.out.println("1D array: ");
    // chnge the array into 1d array
int total = r*c;
int [] arr1d = new  int[total];
int num =0;
for(int i=0; i<r;i++){
    for(int j=0;j<c;j++){
       arr1d[num] = arr2d[i][j];
       num++;
    }
  }
  // print arr1d
  for(int i=0;i<total;i++){
    System.out.print(arr1d[i]+" ");
  }
      sc.close();
   }
}




