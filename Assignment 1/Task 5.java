import java.util.*;
class task5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int length = sc.nextInt();
    int [] arr = new int[length];
    // loop for taking input elements of array
    System.out.println("Enter the elements of array: ");
    for(int i =0;i<length;i++){
        int element= sc.nextInt();
        arr[i]= element;
    }
    // to reverse the array
    int save ;
    int reverse = length-1;
    for(int forward =0;forward<length / 2;forward++){ //mid point a off jehetu both side theke astese
        save = arr[forward];
        arr[forward]= arr[reverse];
        arr[reverse] = save;
        reverse--;
    }
    // to print the array
    for(int m=0;m<length;m++){
        System.out.print(arr[m]+" ");
    }
  }
}

