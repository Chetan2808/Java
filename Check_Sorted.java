import java.util.*;
public class Check_Sorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] names = new int[size];
        for(int i = 0 ; i < size ; i ++){
            System.out.print("Enter the numbers ");
            names[i] = input.nextInt();
        }
        boolean isAscending = true;
        for(int i = 0 ; i < names.length-1 ; i++){
            if(names[i]> names[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
