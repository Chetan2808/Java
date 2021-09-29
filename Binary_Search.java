import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int li = array[0];
        int hi = array[9];
        int mi = (li + hi) / 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int item = input.nextInt();
        while (li <= hi) {
            if (array[mi] == item) {
                System.out.println("Item found at " + mi + " index position");
                break;
            } else if (array[mi] < item) {
                li = mi + 1;
            }
            else{
                hi = mi -1;
            }
            mi = (li + hi )/2;
        }
    }
}
