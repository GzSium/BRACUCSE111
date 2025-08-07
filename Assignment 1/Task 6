import java.util.*;
class task6{
public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the leength of array ");
    int length = sc.nextInt();
    int [] arr = new int[length];
    //array input
    for(int i=0;i<length;i++){
     System.out.println("Enter the elements of the array: ");
    arr[i]= sc.nextInt();
    }
    // unique array banano
    int [] arr1 =new int[length];
    int count = 0;
    for(int m = 0;m<length;m++){
       boolean match = false;
    for(int k=0;k<count;k++){
        if(arr[m]==arr1[k]){
            match =true;
            break; // first loop break, second loop cholbe
        }
    }
    if(match == false){
        arr1[count]=arr[m];
        count++;
    }
    }
    for(int out=0;out<count;out++){
        int c = 0;
        for(int in=0;in<length;in++){
            if(arr1[out] ==arr[in]){
                c++;
            }
        }
        System.out.println(arr1[out]+" - "+c+" times ");
    }
    sc.close();
}
}
