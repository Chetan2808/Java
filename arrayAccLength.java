import java.util.Arrays;
import java.util.Scanner;

public class arrayAccLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of array: ");
            arr[i] = input.nextInt();

            }
        System.out.println(Arrays.toString(arr));
        }
    }


