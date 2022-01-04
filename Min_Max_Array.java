import java.util.*;
public class Min_Max_Array {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        int max = 0;
        //loop for input of array
        for(int i = 0 ; i <size ; i++){
            System.out.print("Enter the number: ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i = 0 ; i < size ; i++ ){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum value of array is :" + max);
        System.out.println("Minimum value of array is :" + min);
    }
}
