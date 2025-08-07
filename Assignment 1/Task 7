import java.util.*;
class task7{
public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
    System.out.println("N= ");
    int length = sc.nextInt();
    float [] arr = new float[length];
    for(int i=0;i<length;i++){
     System.out.println("Please enter the elements of the array: ");
     float e = sc.nextFloat();
     arr[i]=e;
    }
    // unique array banano
    float [] arr1 =new float[length];
    int count = 0;
    for(int m = 0;m<length;m++){
       boolean match = false;
    for(int k=0;k<count;k++){
        if(arr[m]==arr1[k]){
            match =true;
            break;
        }
    }
    if(match == false){
        arr1[count]=arr[m];
        count++;
    }
    }
    //new array to count 0 & unique only
    int z_count = 0;
    int arr_count = 0;
    for(int n=0;n<length;n++){
        if(arr1[n]==0){
            z_count++;
        }else{
            arr_count++;
        }
    }
    //unique array create 
    float [] arr2 =new float[arr_count];
    int new_count =0;
    for(int a=0;a<length;a++){
        if(arr1[a] !=0){
        arr2[new_count]= arr1[a];
        new_count ++;
        }
    }
// or just subtract both array
    for(int j=0;j<arr_count;j++){
        System.out.println(arr2[j]+" ");
    }
    System.out.println("Removed elements : "+z_count);
    sc.close();
}
}
