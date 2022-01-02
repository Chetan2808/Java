import java.util.*;
public class Array_Index {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = input.nextInt();
        int[] search = new int[size];
        System.out.print("Enter the array: ");
        for(int i = 0 ; i <size ; i++){
            search[i] = input.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int x = input.nextInt();
        for(int i = 0 ; i < size ; i++){
            if(search[i] == x){
                System.out.println("The index of number you searched is " + i);
            }
        }
    }
}
