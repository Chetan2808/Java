import java.util.*;
public class TwoDArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows of array : ");
        int rows = input.nextInt();
        System.out.print("Enter the columns of array : ");
        int cols = input.nextInt();
        int[][] numbers = new int[rows][cols];
        //input of array
        //outer is loop for rows
        for(int i = 0 ; i < rows ; i++){
            // inner loop is for columns
            for (int j = 0 ; j < cols ; j ++){
                System.out.print("Enter the number : ");
                numbers[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter the number you want to search : ");
        int x = input.nextInt();
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(numbers[i][j] == x){
                    System.out.println("Location of your searched number is : " + i + " " + j + " ");
                }
            }
        }
    }
}
