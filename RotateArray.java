import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the elements of array: ");
            arr[i] = input.nextInt();

        }
        //System.out.println(Arrays.toString(arr));
        System.out.print("Enter the number to rotate the array: ");
        int d = input.nextInt();
    }
}
