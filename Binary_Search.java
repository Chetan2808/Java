import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,22,33,44,55,66,77,88,99,100,101,120,130,140,150,160,170,180};
        int length = array.length;
        int li = 0;
        int hi = length-1;
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
